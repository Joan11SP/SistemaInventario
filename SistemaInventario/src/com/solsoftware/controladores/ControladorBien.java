package com.solsoftware.controlador;

import com.solsoftware.conexion.ConexionBaseDatos;
import com.solsoftware.modelos.Bien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTIAN
 */
public class ControladorBien {
    private ConexionBaseDatos conexion; 
    public ControladorBien(ConexionBaseDatos conexion) {
        this.conexion = conexion;
    }
    public ArrayList <Bien> getBienDB() {
        ArrayList<Bien> bienDB=new ArrayList<Bien>();
        try{
            ResultSet resultado; 
            Statement sentencia = conexion.getConnection().createStatement();
            String consulta="SELECT * FROM inventario_istl.bien;"; 
            resultado=sentencia.executeQuery(consulta);
            
            if(resultado.next()){
                Bien bien=new Bien();
                bien.setCodigo_barra(resultado.getString("codigo_barra"));
                bien.setNombre(resultado.getString("nombre"));
                bien.setCantidad(resultado.getInt("cantidad"));
                bien.setDescripcion(resultado.getString("descripcion"));
                bien.setTipo_bien(resultado.getInt("tipo_bien"));
                bien.setUbicacion(resultado.getString("ubicacion"));
                bienDB.add(bien);
            }else{
                JOptionPane.showMessageDialog(null, "No existen datos");
            }
            resultado.close();
        }catch(SQLException e){
            System.out.println("Error en la conexion"+e.getMessage());
            return null;
        }
        return bienDB;
    }
    public void guardar(Bien bien) {
        String guardar = "INSERT INTO `inventario_istl`.`bien` (`codigo_barra`, `nombre`, `cantidad`, `descripcion`, `tipo_bien`, `ubicacion`) VALUES ('?', '?', '?', '?', '?', b'?');";
        try {
            try ( PreparedStatement preparar = conexion.getConnection().prepareStatement(guardar)) {
                preparar.setString(1, bien.getCodigo_barra());
                preparar.setString(2, bien.getNombre());
                preparar.setInt(3, bien.getCantidad());
                preparar.setString(4, bien.getDescripcion());
                preparar.setInt(5, bien.getTipo_bien());
                preparar.setString(6, bien.getUbicacion());
                preparar.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Datos Guardados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos");

        }
    }
    public void modificar(Bien bien) {
        String actualizar = "UPDATE `inventario_istl`.`bien` SET `codigo_barra` = ?'" + bien.getCodigo_barra()
                + "', `nombre` = '" + bien.getNombre()
                + "', `cantidad` = '" + bien.getCantidad()
                + "', `descripcion` = '" + bien.getDescripcion()
                + "', `tipo_bien` = '" + bien.getTipo_bien()
                + "', `ubicacion` = '" + bien.getUbicacion()
                + "' WHERE (`cedula` = '" + bien.getCodigo_barra() + "');";
        try ( PreparedStatement preparar = conexion.getConnection().prepareStatement(actualizar)) {
            int n = preparar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Modificados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar datos" + ex.getMessage());
        }
    }
    public void eliminar(Bien bien) {
        String eliminar = "DELETE FROM `inventario_istl`.`bien` WHERE (`codigo_barra` = ?);";
        try {
            try ( PreparedStatement preparar = conexion.getConnection().prepareStatement(eliminar)) {
                preparar.setString(1, bien.getCodigo_barra());
                int n = preparar.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos Eliminados");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar datos" + ex.getMessage());

        }
    }
    public void limpiar(Bien bien) {
        bien.setCodigo_barra(null);
        bien.setNombre(null);
        bien.setDescripcion(null);
        bien.setTipo_bien(0);
        bien.setUbicacion(null);
    }
}

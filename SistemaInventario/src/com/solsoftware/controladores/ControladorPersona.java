package com.solsoftware.controladores;

import com.solsoftware.modelos.Persona;
import com.solsotfware.conexion.ConexionBaseDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorPersona {

    private ConexionBaseDatos conexion;
    Persona persona = new Persona();

    public ControladorPersona(ConexionBaseDatos conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Persona> getPersonaDB() {
        ArrayList<Persona> personadb = new ArrayList<Persona>();
        try {
            ResultSet resultado;

            Statement sentencia = conexion.getConnection().createStatement();
            String consulta = "SELECT * FROM inventario_istl.persona where cedula='"+persona.getCedula()+"';";
            resultado = sentencia.executeQuery(consulta);

            if (resultado.next()) {

              //  persona.setCedula(resultado.getString("cedula"));
                persona.setNombre(resultado.getString("nombre"));
                persona.setApellido_paterno(resultado.getString("apellido_paterno"));
                //persona.setApellido_materno(resultado.getString("apellido_materno"));
                //persona.setTelefono(resultado.getInt("telefono"));
                //persona.setTipo(resultado.getInt("tipo"));
                personadb.add(persona);
            } else {
                JOptionPane.showMessageDialog(null, "No existen datos");
            }
            resultado.close();
        } catch (SQLException e) {
            System.out.println("error en la conexión " + e.getMessage());
            return null;

        }
        return personadb;
    }

    public void guardar() {
        String guardar = "INSERT INTO `inventario_istl`.`persona` (`cedula`, `contrasenia`, `apellido_paterno`, `apellido_materno`, `nombre`, `telefono`, `correo`, `tipo`) VALUES (?,?,?,?,?,?,?,?);";
        try {
            try (PreparedStatement preparar = conexion.getConnection().prepareStatement(guardar)) {
                preparar.setString(1, persona.getCedula());
                preparar.setString(3, persona.getNombre());
                preparar.setString(4, persona.getApellido_paterno());
                preparar.setString(5, persona.getApellido_materno());
                preparar.setInt(6, persona.getTelefono());
                preparar.setString(7, persona.getCorreo());
                preparar.setInt(8, persona.getTipo());
                preparar.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos Guardados");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar datos" + ex.getMessage());

        }
    }
    void nuevo() {
        persona.setCedula("");
        persona.setApellido_materno("");
        persona.setApellido_paterno("");
        persona.setNombre("");
        persona.setCorreo("");
        persona.setTipo(0);
    }


    public void modificar() {
        String modificar = "Update inventario_istl.persona set contrasenia='" + persona.getContrasenia() + "',"
                + "nombre='" + persona.getNombre() + "',"
                + "apellido_paterno='" + persona.getApellido_paterno() + "',"
                + "apellido_materno='" + persona.getApellido_materno() + "',"
                + "correo='" + persona.getCorreo() + "',"
                + "telefono='" + persona.getCorreo() + "',"
                + "tipo='" +persona.getTipo() + "'" + "WHERE cedula = '" + persona.getCedula() + "'";
        try {
            try (PreparedStatement preparar = conexion.getConnection().prepareStatement(modificar)) {
                preparar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos Modificados");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar datos " + ex.getMessage());

        }
        
    }
    public void eliminar() {
        String eliminar = "DELETE FROM `inventario_istl`.`persona` WHERE (`cedula` = '" + persona.getCedula() + "');";
        if (JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar los datos?",
                "Eliminar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                try (PreparedStatement preparar = conexion.getConnection().prepareStatement(eliminar)) {
                    preparar.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Datos eliminados");
                    nuevo();

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al eliminar datos" + ex.getMessage());

            }

        }

    }

}

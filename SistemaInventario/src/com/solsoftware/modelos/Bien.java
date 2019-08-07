package com.solsoftware.modelos;

/**
 *
 * @author CRISTIAN
 */
public class Bien {
    private String codigo_barra, nombre, descripcion, ubicacion;
    private int cantidad, tipo_bien;

    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo_bien(int tipo_bien) {
        this.tipo_bien = tipo_bien;
    }

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTipo_bien() {
        return tipo_bien;
    }
    
    public String toString() {
        return "Bien{" + "codigo_barra=" + codigo_barra + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", cantidad=" + cantidad + ", tipo_bien=" + tipo_bien + '}';
    }

    
    
    
}

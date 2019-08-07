package com.solsotfware.conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static final String URL = "jdbc:mysql://localhost:3306/inventario_istl?autoReconnect=true&useSSL=false&maxReconnection=5";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "1234";
    private Connection connection;

    public ConexionBaseDatos() {
        conect();
    }

    private void conect() {
        try {
            connection = (Connection) DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean isconectado() {
        if (connection != null) {
            return true;
        } else {
            return connection == null;
        }
    }
}

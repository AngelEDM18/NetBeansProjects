/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DOCENTRO
 */
public class Bd {

    public static String url = "jdbc:mysql://localhost:3306/telepizza";

    public static Connection CrearConexion() {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        } catch (SQLException ex) {
            System.err.println("Otra excepcion " + ex.toString());
        }
        return cnn;
    }

    public static ArrayList<Usuario> consultaUsuarios(String usuario, String pass) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Usuario usr;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM usuarios WHERE User_name='" + usuario + "' AND User_password='" + pass + "';";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                usr = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                lista.add(usr);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static ArrayList<Pizza> consultaPizzas() {
        ArrayList<Pizza> listaPizzas = new ArrayList<Pizza>();
        Pizza piz;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM pizzas;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                piz = new Pizza(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
                listaPizzas.add(piz);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaPizzas;
    }

    public static boolean compruebaTelefono(int telefono, String usuario) {
        boolean encontrado = false;
        Usuario usr;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM usuarios WHERE User_name='" + usuario + "' AND User_phone='" + telefono + "';";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            int reg = 0;
            while (rs.next()) {
                reg++;
            }
            if (reg != 0) {
                encontrado = true;
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return encontrado;
    }

    public static boolean agregarUsuario(String username, String pass, String direccion, String email, String telefono, String nombre, String apellidos) {
        boolean agregado = false;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "INSERT INTO usuarios (User_name, User_password, User_address, User_email, User_phone, Nombre, Apellidos) VALUES ('" + username + "', '" + pass + "', '" + direccion + "', '" + email + "', '" + telefono + "', '" + nombre + "', '" + apellidos + "');";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            stm.executeUpdate();
            agregado=true;
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return agregado;
    }
}

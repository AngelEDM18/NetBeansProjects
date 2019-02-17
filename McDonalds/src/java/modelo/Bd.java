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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno_2DAW
 */
public class Bd {

    public static String url = "jdbc:mysql://localhost:3306/macdonals";

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
            String sentenciaSQL = "SELECT * FROM usuario WHERE usuario='" + usuario + "' AND pass='" + pass + "';";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                usr = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                lista.add(usr);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static ArrayList<Bebidas> consultaBebidas() {
        ArrayList<Bebidas> lista = new ArrayList<Bebidas>();
        Bebidas beb;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM bebidas;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                beb = new Bebidas(rs.getInt(1), rs.getString(2));
                lista.add(beb);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static ArrayList<Complementos> consultaComplementos() {
        ArrayList<Complementos> lista = new ArrayList<Complementos>();
        Complementos com;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM complementos;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                com = new Complementos(rs.getInt(1), rs.getString(2));
                lista.add(com);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static ArrayList<Ensaladas> consultaEnsaladas() {
        ArrayList<Ensaladas> lista = new ArrayList<Ensaladas>();
        Ensaladas ens;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM ensaladas;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ens = new Ensaladas(rs.getInt(1), rs.getString(2));
                lista.add(ens);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static ArrayList<Menus> consultaMenus() {
        ArrayList<Menus> lista = new ArrayList<Menus>();
        Menus men;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM menus;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                men = new Menus(rs.getInt(1), rs.getString(2));
                lista.add(men);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static ArrayList<Sandwiches> consultaSandwiches() {
        ArrayList<Sandwiches> lista = new ArrayList<Sandwiches>();
        Sandwiches san;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM sandwiches;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                san = new Sandwiches(rs.getInt(1), rs.getString(2));
                lista.add(san);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static boolean consultaTlf(int telefono, String usuario) {
        boolean encontrado = false;
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Usuario usr;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM usuario WHERE usuario='" + usuario + "' AND telefono='" + telefono + "';";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                usr = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                lista.add(usr);
            }
            if (lista.size() != 0) {
                encontrado = true;
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return encontrado;
    }

}

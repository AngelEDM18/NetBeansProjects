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

    public static String url = "jdbc:mysql://localhost:3306/libreriaonline";

    public static Connection CrearConexion() {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection(url, "root", "trebujena");
        } catch (ClassNotFoundException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        } catch (SQLException ex) {
            System.err.println("Otra excepcion " + ex.toString());
        }
        return cnn;
    }

    public static ArrayList<Libro> consultaTitulos() {
        ArrayList<Libro> lista = new ArrayList<Libro>();
        Libro ebook;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM libros;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ebook = new Libro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6));
                lista.add(ebook);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

    public static boolean agregarLibro(int codigo, String titulo, String autor, String fecha, int paginas, int precio) throws SQLException {
        boolean agregado = false;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String AgregarSQL = "INSERT INTO libros VALUES ('" + codigo + "','" + titulo + "','" + autor + "','" + fecha + "','" + paginas + "','" + precio + "');";
            PreparedStatement stm = cnn.prepareStatement(AgregarSQL);
            stm.executeUpdate(AgregarSQL);
            agregado = true;
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return agregado;
    }

}

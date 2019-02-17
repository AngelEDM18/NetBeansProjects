/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno_2DAW
 */
public class Bd {

    public static String url = "jdbc:mysql://localhost:3306/books";

    public static Connection CrearConexion() {
        Connection cnn  = null;
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

    public static ArrayList<Libro> consultaTitulos(String dato) {
        ArrayList<Libro> lista = new ArrayList<Libro>();
        Libro ebook;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT titulos.titulo, titulos.ISBN, autor.nombre, Editorial.NameEditorial, titulos.descripcion FROM titulos, autor, editorial WHERE (titulos.idautor=autor.idautor) AND (titulos.ideditorial=editorial.ideditorial) AND (titulos.titulo like ?);";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            stm.setString(1, "%" + dato + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ebook = new Libro(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(ebook);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return lista;
    }

}

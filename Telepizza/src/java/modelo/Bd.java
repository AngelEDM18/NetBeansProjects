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

    public static ArrayList<Oferta> consultaOfertas() {
        ArrayList<Oferta> listaOfertas = new ArrayList<Oferta>();
        Oferta ofe;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM ofertas;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ofe = new Oferta(rs.getInt(1), rs.getString(2));
                listaOfertas.add(ofe);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaOfertas;
    }

    public static ArrayList<Menu> consultaMenus() {
        ArrayList<Menu> listaMenus = new ArrayList<Menu>();
        Menu men;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM menus;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                men = new Menu(rs.getInt(1), rs.getString(2));
                listaMenus.add(men);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaMenus;
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
                piz = new Pizza(rs.getInt(1), rs.getString(2), rs.getInt(3));
                listaPizzas.add(piz);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaPizzas;
    }

    public static ArrayList<Entrante> consultaEntrantes() {
        ArrayList<Entrante> listaEntrantes = new ArrayList<Entrante>();
        Entrante ent;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM entrante;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ent = new Entrante(rs.getInt(1), rs.getInt(2), rs.getString(3));
                listaEntrantes.add(ent);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaEntrantes;
    }

    public static ArrayList<Hamburguesa> consultaHamburguesas() {
        ArrayList<Hamburguesa> listaHamburguesas = new ArrayList<Hamburguesa>();
        Hamburguesa ham;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM hambueguesa;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ham = new Hamburguesa(rs.getInt(1), rs.getString(2));
                listaHamburguesas.add(ham);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaHamburguesas;
    }

    public static ArrayList<Pasta> consultaPastas() {
        ArrayList<Pasta> listaPastas = new ArrayList<Pasta>();
        Pasta pas;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM pasta;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                pas = new Pasta(rs.getInt(1), rs.getString(2));
                listaPastas.add(pas);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaPastas;
    }

    public static ArrayList<Ensalada> consultaEnsaladas() {
        ArrayList<Ensalada> listaEnsaladas = new ArrayList<Ensalada>();
        Ensalada ens;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM ensaladas;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ens = new Ensalada(rs.getInt(1), rs.getString(2));
                listaEnsaladas.add(ens);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaEnsaladas;
    }

    public static ArrayList<Bebida> consultaBebidas() {
        ArrayList<Bebida> listaBebidas = new ArrayList<Bebida>();
        Bebida beb;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM bebidas;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                beb = new Bebida(rs.getInt(1), rs.getString(2));
                listaBebidas.add(beb);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaBebidas;
    }

    public static ArrayList<Postre> consultaPostres() {
        ArrayList<Postre> listaPostres = new ArrayList<Postre>();
        Postre pos;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM postre;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                pos = new Postre(rs.getInt(1), rs.getString(2));
                listaPostres.add(pos);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return listaPostres;
    }

}

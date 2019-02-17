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

    public static String url = "jdbc:mysql://localhost:3306/ventas_comerciales";

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

    public static ArrayList<Venta> consultaVentas(int codigo) {
        ArrayList<Venta> venta = new ArrayList<Venta>();
        Venta vent;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT comerciales.nombre as comercial, productos.nombre as producto, "
                    + "ventas.cantidad ,productos.precio, ROUND((ventas.cantidad*productos.precio),2) as "
                    + "total,productos.descuento, ROUND(productos.precio-(productos.precio*(productos.descuento/100)),2) "
                    + "as totalDescuento, ventas.fecha FROM ventas_comerciales.comerciales, "
                    + "ventas_comerciales.productos, ventas_comerciales.ventas WHERE "
                    + "productos.referencia=ventas.refProducto AND comerciales.codigo=ventas.codComercial "
                    + "AND comerciales.codigo='" + codigo + "';";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                vent = new Venta(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getString(8));
                venta.add(vent);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return venta;
    }

    public static ArrayList<Comercial> consultaComerciales() {
        ArrayList<Comercial> comercial = new ArrayList<Comercial>();
        Comercial com;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM comerciales;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                com = new Comercial(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getString(5));
                comercial.add(com);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return comercial;
    }

    public static ArrayList<Usuario> consultaLogin(String nombre, String pass) {
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();
        Usuario usr;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM usuario WHERE usuario='" + nombre + "' AND password='" + pass + "';";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                usr = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3));
                usuario.add(usr);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return usuario;
    }

    public static ArrayList<Producto> consultaProductos() {
        ArrayList<Producto> producto = new ArrayList<Producto>();
        Producto prod;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM productos;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                prod = new Producto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5));
                producto.add(prod);
            }
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return producto;
    }

    public static ArrayList<Venta> nuevaVenta() {
        ArrayList<Venta> comercial = new ArrayList<Venta>();
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            String sentenciaSQL = "SELECT * FROM comerciales;";
            PreparedStatement stm = cnn.prepareStatement(sentenciaSQL);
            ResultSet rs = stm.executeQuery();
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return comercial;
    }

    public static boolean agregar(Venta venta) {
        boolean agregado = false;
        Connection cnn = null;
        try {
            cnn = CrearConexion();
            Statement stm;
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery("SELECT * FROM ventas");
            int codComercial = venta.getCodComercial();
            String refProducto = venta.getRefProducto();
            int cantidad = venta.getVentaCantidad();
            String fecha = venta.getFechaVenta();
            rs.moveToInsertRow();
            rs.updateInt("codComercial", codComercial);
            rs.updateString("refProducto", refProducto);
            rs.updateInt("cantidad", cantidad);
            rs.updateString("fecha", fecha);
            rs.insertRow();
            agregado = true;
        } catch (SQLException ex) {
            System.err.println("Controlador JDBC no encontrado " + ex.toString());
        }
        return agregado;
    }

    public static boolean modificar(int[] numbers, int cod) {
        boolean mod=false;
        Connection cnn = null;
        int num=2;
        try {
            cnn = CrearConexion();
            PreparedStatement pst;
            String sql="UPDATE ventas SET cantidad=? WHERE codComercial='" + cod + "';";  
            pst = cnn.prepareStatement(sql);
            pst.setInt(1, num);
            pst.executeUpdate();
            mod=true;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.toString());
        }
        return mod;
    }

}

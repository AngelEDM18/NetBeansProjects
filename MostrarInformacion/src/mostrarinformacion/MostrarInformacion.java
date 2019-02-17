/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarinformacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno_2DAW
 */
public class MostrarInformacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String drv = "com.mysql.jdbc.Driver";
        String db = "jdbc:mysql://localhost:3306/productosinformaticos?iseSSL=false";
        Connection con;
        try {
            Class.forName(drv);
            con = DriverManager.getConnection(db, "root", "trebujena");
            Statement stmt = con.createStatement();
            String sentenciaSQL = "SELECT * FROM impresorasmicros";
            ResultSet rs = stmt.executeQuery(sentenciaSQL);
            int trimestre, impresoras, micros;
            double ventasImpresoras, ventasMicros;
            String vendedor;
            while (rs.next()) {
                trimestre = rs.getInt("trimestre");
                impresoras = rs.getInt("impresoras");
                ventasImpresoras = rs.getDouble("ventasImpresoras");
                micros = rs.getInt("micros");
                ventasMicros = rs.getDouble("ventasMicros");
                vendedor = rs.getString("vendedores");
                System.out.println("Trimestre: " + trimestre + ". Impresoras: " + impresoras + ". VentaImpresoras: " + ventasImpresoras + " Micros: " + micros + ". VentasMicros: " + ventasMicros + " Vendedor: " + vendedor);
            }

        } catch (ClassNotFoundException ex) {
            System.err.println("Controlador JDBC no encontrado: "+ex.toString());
        } catch (SQLException ex) {
            System.err.println("Excepcion capturada de SQL: "+ex.toString());
        }

    }

}

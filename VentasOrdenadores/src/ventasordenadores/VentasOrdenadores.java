/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasordenadores;

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
public class VentasOrdenadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/ordenadores";
        Connection con = null;
        String tabla[][] = new String[4][3];
        String sqlSelect = "SELECT * FROM ventasordenadores";
        String sql1 = "DELETE FROM ventasordenadores WHERE unidades>60";
        String sql3 = "UPDATE ventasordenadores SET vendedores='yo'";
        String sql4 = "UPDATE ventasordenadores SET vendedores='cucu' WHERE unidades>55";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "trebujena");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlSelect);
            int cont = 0;
            while (rs.next()) {
                tabla[cont][0] = rs.getString("trimestre");
                tabla[cont][1] = rs.getString("unidades");
                tabla[cont][2] = rs.getString("vendedores");
                cont++;
            }
            stmt.executeUpdate(sql1);
            int num;
            for (int x = 0; x < tabla.length; x++) {
                num = Integer.parseInt(tabla[x][1]);
                if (num > 60) {
                    String sql2 = "INSERT INTO ventasordenadores VALUES('" + tabla[x][0] + "','" + tabla[x][1] + "','" + tabla[x][2] + "')";
                    stmt.executeUpdate(sql2);
                }
            }

            stmt.executeUpdate(sql3);
            stmt.executeUpdate(sql4);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentasOrdenadores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VentasOrdenadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

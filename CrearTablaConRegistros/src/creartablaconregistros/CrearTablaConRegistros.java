/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creartablaconregistros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno_2DAW
 */
public class CrearTablaConRegistros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mibasedatos";
        Connection con = null;
        System.out.println("Selecciona una opcion (A/B)");
        String opcion = leer.next();
        int eleccion = 0;
        String[] sentencias = new String[2];
        String[] rellenar = new String[2];
        if (opcion.equalsIgnoreCase("a")) {
            eleccion = 0;
        } else if (opcion.equalsIgnoreCase("b")) {
            eleccion = 1;
        }
        String borrado = "DROP TABLE IF EXISTS mitabla";

        sentencias[0] = "CREATE TABLE mitabla (nombre VARCHAR(45) NOT NULL, apellidos VARCHAR(45) NOT NULL,"
                + "edad VARCHAR(45) NOT NULL, telefono VARCHAR(45) NOT NULL)";

        sentencias[1] = "CREATE TABLE mitabla (nombre VARCHAR(45) NOT NULL, apellidos VARCHAR(45) NOT NULL,"
                + "edad INTEGER UNSIGNED NOT NULL, lugarResidencia VARCHAR(45) NOT NULL, fechaNacimiento DATE NOT NULL)";

        rellenar[0] = "INSERT INTO mitabla VALUES ('Jesus','Fernandez Ortega','28','941200369'),('Pepe','Botella Ruiz','26',"
                + "'641212365'),('Carlos','Ruiz Gil','26','941124541')";

        rellenar[1] = "INSERT INTO mitabla VALUES ('Jesus','Fernandez Ortega','28','Logroño','1975-03-22'),('Pepe','Botella Ruiz','26',"
                + "'Madrid','1975-10-12'),('Carlos','Ruiz Gil','26','Barcelona','1976-11-25')";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "trebujena");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(borrado);
            stmt.executeUpdate(sentencias[eleccion]);
            stmt.executeUpdate(rellenar[eleccion]);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearTablaConRegistros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrearTablaConRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

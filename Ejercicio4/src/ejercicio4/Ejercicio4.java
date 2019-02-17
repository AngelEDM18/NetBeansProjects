/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import excepciones.CamposIncorrectosException;
import excepciones.CamposVaciosException;
import java.util.Scanner;
import modelo.DVDCine;

/**
 *
 * @author alumno_2DAW
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean error = false;
        do {
            try {
                // TODO code application logic here
                System.out.println("Introduce titulo");
                String titulo = leer.next();
                System.out.println("Introduce actores");
                String actores = leer.next();
                System.out.println("Introduce director");
                String director = leer.next();
                System.out.println("Introduce genero");
                String genero = leer.next();
                System.out.println("Introduce duracion");
                int duracion = leer.nextInt();
                System.out.println("Introduce resumen");
                String resumen = leer.next();

                DVDCine dvd = new DVDCine(titulo, actores, director, genero, duracion, resumen);
                muestraDVDCine(dvd);
                
            } catch (CamposVaciosException | CamposIncorrectosException | NumberFormatException ex) {
                System.err.println(ex.getMessage());
                error = true;
            }
        } while (error);
    }

    private static void muestraDVDCine(DVDCine dvd) {
        System.out.println(dvd.getTitulo());
        System.out.println("De: " + dvd.getDirector());
        System.out.println("Con: " + dvd.getActores());
        System.out.println(dvd.getGenero() + " - " + dvd.getDuracion() + " min");
        System.out.println(dvd.getResumen());
        esThriller(dvd.getGenero());
        tieneResumen(dvd.getResumen());

    }

    private static void esThriller(String genero) {
        if (genero.equalsIgnoreCase("thriller")) {
            System.out.println("Es thriller");
        } else {
            System.out.println("No es thriller");
        }
    }

    private static void tieneResumen(String resumen) {
        if (resumen.length() > 0) {
            System.out.println("La ficha tiene resumen");
        } else {
            System.out.println("La ficha no tiene resumen");
        }
    }
}

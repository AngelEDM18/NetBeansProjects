/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import excepciones.CampoIncorrectoException;
import excepciones.CamposVaciosException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;

/**
 *
 * @author alumno_2DAW
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        String nombre;
        int num;
        double nota1, nota2, media;
        //Alumno alu = new Alumno(nombre, num, nota1, nota2, media);

        try {
            System.out.println("Introduzca nombre");
            nombre = leer.next();

            System.out.println("Introduzca el numero");
            num = leer.nextInt();

            nota1 = ponNota1(leer);

            nota2 = ponNota2(leer);

            media = dameMedia(nota1, nota2);

            muestraAlumno(nombre, num, nota1, nota2, media);
            
            Alumno alu = new Alumno(nombre, num, nota1, nota2, media);

        } catch (CamposVaciosException | CampoIncorrectoException ex) {
            System.err.println(ex.getMessage());
        } catch (InputMismatchException | NumberFormatException ex) {
            System.err.println("Error en el campo");
        }

    }

    private static double ponNota1(Scanner leer) {
        double nota1;
        System.out.println("Introduzca la primera nota");
        nota1 = leer.nextDouble();
        return nota1;
    }

    private static double ponNota2(Scanner leer) {
        double nota2;
        System.out.println("Introduzca la primera nota");
        nota2 = leer.nextDouble();
        return nota2;
    }

    private static double dameMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;

    }

    private static void muestraAlumno(String nombre, int num, double nota1, double nota2, double media) {
        System.out.println(num + " " + nombre + " nota media " + media);
    }

}

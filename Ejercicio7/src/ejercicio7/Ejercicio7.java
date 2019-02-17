/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import excepciones.CampoIncorrectoException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Scanner leer = new Scanner(System.in);
            int num = 0;
            do {
                System.out.println("Teclea un numero mayor de 10 y menor que 30");
                num = leer.nextInt();
            } while (num < 10 | num > 30);

            if (num % 5 == 0) {
                System.out.println("El numero " + num + " es divisible por 5");
            } else {
                System.out.println("El numero " + num + " no es divisible por 5");
            }
            String nombre;
            System.out.print("Escribe tu nombre: ");
            nombre = leer.next();
            if (!nombre.matches("([a-z]|[A-Z]|\\s)+")) {
                throw new CampoIncorrectoException("Error. No se pueden introducir letras o caracteres especiales en este campo");
            } else {
                int caracteres = nombre.length();
                System.out.println("Tu nombre tiene " + caracteres + " caracteres");

                System.out.println("Empieza por la letra " + nombre.charAt(0));
                System.out.println("Termina por la letra " + nombre.charAt(caracteres - 1));

                System.out.println("Tu nombre en mayuscula es: " + nombre.toUpperCase());
                System.out.println("Tu nombre en minuscula es: " + nombre.toLowerCase());

                char c = (char) 164;
                char C = (char) 165;
                int busqueda = nombre.indexOf(c);
                if (busqueda < 0) {
                    System.out.println("Tu nombre no contiene la ñ");
                } else {
                    System.out.println("Tu nombre contiene la ñ");
                }
            }

        } catch (CampoIncorrectoException ex) {
            System.err.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.err.println("Error. Ha introducido una letra en un campo numerico");
        }

    }

}

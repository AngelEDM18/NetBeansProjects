/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import excepciones.CampoIncorrectoException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno_2DAW
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        String alimento = "";
        int proteinas = 0, lipidos = 0, hidratos = 0;
        String minerales = "", vitaminas = "", animal = "";
        double suma;

        try {
            alimento = denomAlimento(leer);
            proteinas = contProteinas(leer);
            lipidos = contLipidos(leer);
            hidratos = contHidratos(leer);
            minerales = contMinerales(leer);
            vitaminas = contVitaminas(leer);
            animal = origenAnimal(leer);

            System.out.println("");
            System.out.println("Nombre: " + alimento);
            System.out.println("Analisis:");
            System.out.println("Lipidos: " + Double.parseDouble(Integer.toString(lipidos)));
            System.out.println("Hidratos de carbono: " + Double.parseDouble(Integer.toString(hidratos)));
            System.out.println("Proteinas: " + Double.parseDouble(Integer.toString(proteinas)));
            System.out.println("Contenido en vitaminas: " + vitaminas);
            System.out.println("Contenido en minerales: " + minerales);
            System.out.println(animal);
            if (lipidos < 20 && !vitaminas.equalsIgnoreCase("B")) {
                System.out.println("Es dietetico");
            } else {
                System.out.println("No es dietetico");
            }
            suma = (lipidos * 9.4) + (proteinas * 5.3) + (hidratos * 4.1);
            if ((proteinas > 15 && proteinas < 35) && (lipidos > 10 && lipidos < 25) && (hidratos > 55 && hidratos < 65)) {
                System.out.println("Es recomendable para deportistas");
            } else {
                System.out.println("No es recomendable para deportistas");
            }
            System.out.println("Contenido energetico: " + suma + " Kcal./100gr.");

        } catch (CampoIncorrectoException | InputMismatchException ex) {
            System.err.println(ex.getMessage());

        }

    }

    private static String denomAlimento(Scanner leer) throws CampoIncorrectoException {
        String alimento;
        boolean error = true;
        do {
            System.out.print("Denominacion de un alimento: ");
            alimento = leer.next();
            if (!alimento.matches("([a-z]|[A-Z]|\\s)+")) {
                throw new CampoIncorrectoException("Error. No se pueden introducir letras o caracteres especiales en este campo");
            } else {
                error = false;
            }
        } while (error = true);
        return alimento;
    }

    private static int contProteinas(Scanner leer) {
        int proteinas;
        System.out.print("Contenido en proteinas: ");
        proteinas = leer.nextInt();
        return proteinas;
    }

    private static int contLipidos(Scanner leer) {
        int lipidos;
        System.out.print("Contenido en lipidos: ");
        lipidos = leer.nextInt();
        return lipidos;
    }

    private static int contHidratos(Scanner leer) {
        int hidratos;
        System.out.print("Contenido en hidratos: ");
        hidratos = leer.nextInt();
        return hidratos;
    }

    private static String contMinerales(Scanner leer) throws CampoIncorrectoException {
        String minerales = "", mineralesOpcion;
        System.out.print("Contenido en minerales (A, M, B): ");
        mineralesOpcion = leer.next();
        if (mineralesOpcion.equalsIgnoreCase("A")) {
            minerales = "alto";
        } else if (mineralesOpcion.equalsIgnoreCase("M")) {
            minerales = "medio";
        } else if (mineralesOpcion.equalsIgnoreCase("B")) {
            minerales = "bajo";
        } else {
            throw new CampoIncorrectoException("Error. Ha introducido una opcion distinta de A, M o B");
        }
        return minerales;
    }

    private static String contVitaminas(Scanner leer) throws CampoIncorrectoException {
        String vitaminas = "", vitaminasOpcion;
        System.out.print("Contenido en vitaminas (A, M, B): ");
        vitaminasOpcion = leer.next();
        if (vitaminasOpcion.equalsIgnoreCase("A")) {
            vitaminas = "alto";
        } else if (vitaminasOpcion.equalsIgnoreCase("M")) {
            vitaminas = "medio";
        } else if (vitaminasOpcion.equalsIgnoreCase("B")) {
            vitaminas = "bajo";
        } else {
            throw new CampoIncorrectoException("Error. Ha introducido una opcion distinta de A, M o B");
        }
        return vitaminas;
    }

    private static String origenAnimal(Scanner leer) throws CampoIncorrectoException {
        String opcion, animal;
        System.out.print("¿Es de origen animal? (S/N): ");
        opcion = leer.next();
        if (opcion.equalsIgnoreCase("S")) {
            animal = "Es de origen animal";
        } else if (opcion.equalsIgnoreCase("N")) {
            animal = "No es de origen animal";
        } else {
            throw new CampoIncorrectoException("Error. Ha introducido una opcion distinta de S o N");
        }
        return animal;
    }

}

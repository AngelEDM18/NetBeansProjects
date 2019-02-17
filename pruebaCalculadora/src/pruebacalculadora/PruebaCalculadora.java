/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacalculadora;

/**
 *
 * @author Angel
 */
public class PruebaCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double importe = 3.27;
        double pago = 20;
        int billete = 0, monedaUno = 0, monedaCinc = 0, monedaVein = 0, monedaCeroDos = 0, monedaCeroUno = 0;
        if (importe > pago) {
            System.out.println("Error. La cantidad introducida es insuficiente");
        } else {
            double cambio = pago - importe;
            do {
                if (cambio >= 5) {
                    billete++;
                    cambio = cambio - 5;
                } else if (cambio >= 1) {
                    monedaUno++;
                    cambio -= 1.0;
                } else if (cambio >= 0.5) {
                    monedaCinc++;
                    cambio -= 0.5;
                } else if (cambio >= 0.2) {
                    monedaVein++;
                    cambio -= 0.2;
                } else if (cambio >= 0.02) {
                    monedaCeroDos++;
                    cambio -= 0.02;
                } else if (cambio >= 0.01) {
                    monedaCeroUno++;
                    cambio -= 0.01;
                }
            } while (cambio > 0.001);

            System.out.println(billete + " billete/s de 5€");
            System.out.println(monedaUno + " moneda/s de 1€");
            System.out.println(monedaCinc + " moneda/s de 50 cent");
            System.out.println(monedaVein + " moneda/s de 20 cent");
            System.out.println(monedaCeroDos + " moneda/s de 2 cent");
            System.out.println(monedaCeroUno + " moneda/s de 1 cent");

        }

    }

}

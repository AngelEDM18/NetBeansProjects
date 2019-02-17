/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayuda;

/**
 *
 * @author Mode
 */
public class AlquilaVeces {
    
    private String nombre,numero;

    public AlquilaVeces() {
    }

    public AlquilaVeces(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "AlquilaVeces{" + "nombre=" + nombre + ", numero=" + numero + '}';
    }
    
}

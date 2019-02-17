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
public class Clientetotal {
    
    private String nombre;
    private String apellido;
    private Long total;

    public Clientetotal() {
    }

    public Clientetotal(String nombre, String apellido, Long total) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Clientetotal{" + "nombre=" + nombre + ", apellido=" + apellido + ", total=" + total + '}';
    }
    
    
    
}

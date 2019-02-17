/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumno_2DAW
 */
public class Articulo {

    String desripcion;
    int cantidad;
    double precio;
    double total;

    public Articulo(String desripcion, int cantidad, double precio, double total) {
        this.setDesripcion(desripcion);
        this.setCantidad(cantidad);
        this.setPrecio(precio);
        this.setTotal(total);
    }

    public String getDesripcion() {
        return desripcion;
    }

    public void setDesripcion(String desripcion) {
        this.desripcion = desripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Articulo{" + "desripcion=" + desripcion + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + '}';
    }

}

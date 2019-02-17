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
public class Venta {
    int codComercial;
    String refProducto;
    int ventaCantidad;
    String fechaVenta;
    
    String nombreComercial, nombreProducto;
    int cantidadProducto;
    double precio, total, descuento, totalDescuento;
    String fechaCompra;

    public Venta(int codComercial, String refProducto, int ventaCantidad, String fechaVenta) {
        this.setCodComercial(codComercial);
        this.setRefProducto(refProducto);
        this.setVentaCantidad(ventaCantidad);
        this.setFechaVenta(fechaVenta);
    }

    public Venta(String nombreComercial, String nombreProducto, int cantidadProducto, double precio, double total, double descuento, double totalDescuento, String fechaCompra) {
        this.setNombreComercial(nombreComercial);
        this.setNombreProducto(nombreProducto);
        this.setCantidadProducto(cantidadProducto);
        this.setPrecio(precio);
        this.setTotal(total);
        this.setDescuento(descuento);
        this.setTotalDescuento(totalDescuento);
        this.setFechaCompra(fechaCompra);
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
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

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    

    public int getCodComercial() {
        return codComercial;
    }

    public void setCodComercial(int codComercial) {
        this.codComercial = codComercial;
    }

    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public int getVentaCantidad() {
        return ventaCantidad;
    }

    public void setVentaCantidad(int ventaCantidad) {
        this.ventaCantidad = ventaCantidad;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
}

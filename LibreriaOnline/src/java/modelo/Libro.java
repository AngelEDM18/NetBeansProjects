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
public class Libro {

    int codigo;
    String titulo, autor, fecha;
    int paginas;
    double precio;

    public Libro(int codigo, String titulo, String autor, String fecha, int paginas, double precio) {
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setFecha(fecha);
        this.setPaginas(paginas);
        this.setPrecio(precio);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", paginas=" + paginas + ", precio=" + precio + '}';
    }
}

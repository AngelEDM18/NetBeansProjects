/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md;

/**
 *
 * @author alumno_2DAW
 */
public class Libro {

    String titulo, isbn, autor, editorial, descripcion;

    public Libro(String titulo, String isbn, String autor, String editorial, String descripcion) {
        this.setTitulo(titulo);
        this.setIsbn(isbn);
        this.setAutor(autor);
        this.setEditorial(editorial);
        this.setDescripcion(descripcion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", descripcion=" + descripcion + '}';
    }
    public String [] toStringArray() {
        String book [] ={titulo,isbn,autor,editorial,descripcion};
        return book;
    }
}

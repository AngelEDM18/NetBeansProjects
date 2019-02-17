package modelo;


import java.sql.Date;
import java.sql.Timestamp;

import excepciones.CamposObligatoriosException;
import excepciones.isbnException;

public class Libro {
	
	private int idLibros;
	private String titulo,autor,editorial,isbn;
	private boolean prestado;
	private Date fechaPrestamo, fechaDevolucion;
	private Timestamp fechaAlta;
	
	public Libro(int idLibros, String titulo, String autor, String editorial, String isbn, boolean prestado) throws CamposObligatoriosException, isbnException {
		this.setIdLibros(idLibros);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setIsbn(isbn);
		this.setPrestado(prestado);

	}
	
	
	public Libro(int idLibros, String titulo, String autor, String editorial, String isbn, boolean prestado,
			Date fechaPrestamo, Date fechaDevolucion, Timestamp fechaAlta) throws CamposObligatoriosException, isbnException {
		this.setIdLibros(idLibros);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setIsbn(isbn);
		this.setPrestado(prestado);
		this.setFechaPrestamo(fechaPrestamo);
		this.setFechaDevolucion(fechaDevolucion);
		this.setFechaAlta(fechaAlta);
	}


	public int getIdLibros() {
		return idLibros;
	}
	
	public void setIdLibros(int idLibros) throws CamposObligatoriosException {
		if (idLibros==0) {
            
            throw new CamposObligatoriosException("El campo id libro está vacio");
        }
		this.idLibros = idLibros;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) throws CamposObligatoriosException {
		if (titulo.equals("")) {
            
            throw new CamposObligatoriosException("El campo titulo está vacio");
        }
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) throws CamposObligatoriosException {
		if (autor.equals("")) {
            
            throw new CamposObligatoriosException("El campo autor está vacio");
        }
		this.autor = autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) throws CamposObligatoriosException {
		if (editorial.equals("")) {
            
            throw new CamposObligatoriosException("El campo editorial está vacio");
        }
		this.editorial = editorial;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) throws isbnException {
		compruebaIsbn(isbn);
		this.isbn = isbn;
	}
	
	private void compruebaIsbn(String isbn) throws isbnException {
		if (isbn.equals("")){
			System.err.println("ISBN VACIO");
		}else{
		
        boolean datoFalso = false;
        String isbn1 = isbn.replaceAll("-", "");
        String isbn2 = isbn1.substring(0, isbn1.length() - 1);

        try {
            datoFalso = false;
            double isbn3 = Double.parseDouble(isbn2);
            
        } catch (NumberFormatException e) {
            System.err.println("ISBN INCORRECTO");
            datoFalso = true;
           
        }
        if (!datoFalso) {
            
            String dc = isbn1.substring(isbn1.length() - 1, isbn1.length());

//        System.out.println(isbn2);
//        System.out.println(dc);
            int suma = 0;

            for (int x = 0; x < isbn2.length(); x++) {

                double num = Double.parseDouble(String.valueOf(isbn2.charAt(x)));

                if (x % 2 != 0) {
                    suma += num * 3;
                } else {
                    suma += num * 1;
                }
            }
//        System.out.println(suma);

            int resto = suma % 10;
            int DC = 10 - resto;

//        System.out.println(DC);
            if (DC == 10) {
                DC = 0;
            }
            
            int dc1 = Integer.parseInt(dc);
            
            
            if (dc1 == DC) {
                System.out.println("ISBN CORRECTO");
            } else {
                System.err.println("ISBN INCORRECTO");
            }
        }
		}
		
		
	}


	public boolean isPrestado() {
		return prestado;
	}
	
	public void setPrestado(boolean prestado) {
		
		this.prestado = prestado;
	}
	
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public Timestamp getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	@Override
	public String toString() {
		return "Libro [idLibros=" + idLibros + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", isbn=" + isbn + ", prestado=" + prestado + ", fechaPrestamo=" + fechaPrestamo
				+ ", fechaDevolucion=" + fechaDevolucion + ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	
	
}

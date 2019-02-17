/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import excepciones.CamposIncorrectosException;
import excepciones.CamposVaciosException;

/**
 *
 * @author alumno_2DAW
 */
public class DVDCine {

    private String titulo, actores, director, genero;
    private int duracion;
    private String resumen;

    public DVDCine(String titulo, String actores, String director, String genero, int duracion, String resumen) throws CamposVaciosException, CamposIncorrectosException {
        this.setTitulo(titulo);
        this.setActores(actores);
        this.setDirector(director);
        this.setGenero(genero);
        this.setDuracion(duracion);
        this.setResumen(resumen);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws CamposVaciosException {
        if (titulo.length() == 0) {
            throw new CamposVaciosException("Error. El campo titulo no puede estar vacio");
        }
        this.titulo = titulo;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) throws CamposVaciosException, CamposIncorrectosException {
        if (actores.length() == 0) {
            throw new CamposVaciosException("Error. El campo actores no puede estar vacio");
        }
        
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) throws CamposVaciosException, CamposIncorrectosException {
        if (director.length() == 0) {
            throw new CamposVaciosException("Error. El campo director no puede estar vacio");
        }
        
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) throws CamposVaciosException, CamposIncorrectosException {
        if (genero.length() == 0) {
            throw new CamposVaciosException("Error. El campo genero no puede estar vacio");
        }
        if (!director.matches("([a-z]|[A-Z]|\\s)+")) {
                throw new CamposIncorrectosException("Error. No se pueden introducir letras o caracteres especiales en este campo");
        }
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) throws CamposVaciosException {
        if (duracion == 0) {
            throw new CamposVaciosException("Error. El campo duracion no puede ser 0");
        }
        this.duracion = duracion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) throws CamposVaciosException {
        this.resumen = resumen;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import excepciones.CampoIncorrectoException;
import excepciones.CamposVaciosException;

/**
 *
 * @author alumno_2DAW
 */
public class Alumno {

    private String nombre;
    private int numero;
    private double nota1, nota2, media;

    public Alumno(String nombre, int numero, double nota1, double nota2, double media) throws CamposVaciosException, CampoIncorrectoException {
        this.setNombre(nombre);
        this.setNumero(numero);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setMedia(media);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws CamposVaciosException, CampoIncorrectoException {
        if (!nombre.matches("([a-z]|[A-Z]|\\s)+")) {
                throw new CampoIncorrectoException("Error. No se pueden introducir letras o caracteres especiales en este campo");
            }
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws CamposVaciosException {
        if (numero == 0) {
            throw new CamposVaciosException("El campo numero no puede ser 0");
        }
        this.numero = numero;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", numero=" + numero + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + '}';
    }

}

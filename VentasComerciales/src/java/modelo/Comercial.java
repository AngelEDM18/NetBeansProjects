/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel
 */
public class Comercial {

    int codigo;
    String nombre;
    double salario;
    int hijos;
    String fechaNacimiento;

    public Comercial(int codigo, String nombre, double salario, int hijos, String fechaNacimiento) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setSalario(salario);
        this.setHijos(hijos);
        this.setFechaNacimiento(fechaNacimiento);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Comercial{" + "codigo=" + codigo + ", nombre=" + nombre + ", salario=" + salario + ", hijos=" + hijos + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}

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
public class Tarea {

    String contacto, dni, fecha;
    int telefono;
    String email, prioridad, asunto;

    public Tarea(String contacto, String dni, String fecha, int telefono, String email, String prioridad, String asunto) {
        this.setContacto(contacto);
        this.setDni(dni);
        this.setFecha(fecha);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.setPrioridad(prioridad);
        this.setAsunto(asunto);
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String toString() {
        return "Tarea{" + "contacto=" + contacto + ", dni=" + dni + ", fecha=" + fecha + ", telefono=" + telefono + ", email=" + email + ", prioridad=" + prioridad + ", asunto=" + asunto + '}';
    }

}

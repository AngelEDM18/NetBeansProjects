/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class NewStrutsActionForm extends org.apache.struts.action.ActionForm {
    
    private String email;
    private String emailDos;
    private String contrasena;
    private String contrasenaDos;
    private String nombre;
    private String provincia;
    private String apellido;
    private String municipio;
    private String niff;
    private String telefono;
    private String publicidad;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailDos() {
        return emailDos;
    }

    public void setEmailDos(String emailDos) {
        this.emailDos = emailDos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasenaDos() {
        return contrasenaDos;
    }

    public void setContrasenaDos(String contrasenaDos) {
        this.contrasenaDos = contrasenaDos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNiff() {
        return niff;
    }

    public void setNiff(String niff) {
        this.niff = niff;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPublicidad() {
        if("on".equals(publicidad)){
            publicidad = "No deseo publicidad";
        }
        else{
            publicidad = "Si deseo publicidad";
        }
        return publicidad;
    }

    public void setPublicidad(String publicidad) {
        this.publicidad = publicidad;
    }
    
    

    public NewStrutsActionForm() {
        super();
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        /* Email */
        if ( email == null ||email.length() == 0) { 
            errors.add("email", new ActionMessage("error.registro.email")); 
        }
        else if(!email.matches(".+@.+\\.[a-zA-Z]{2,3}")){
            errors.add("email", new ActionMessage("error.registro.emailCorrecto")); 
        }
        
        /* Email confimacion */
        if ( emailDos == null ||emailDos.length() == 0) { 
            errors.add("emailDos", new ActionMessage("error.registro.emailDos")); 
        }
        else if(!emailDos.matches(".+@.+\\.[a-zA-Z]{2,3}")){
            errors.add("emailDos", new ActionMessage("error.registro.emailDosCorrecto")); 
        }
        
        /* Emial iguales */
        if ( !email.equals(emailDos) ) {
            errors.add("confirmacionEmail", new ActionMessage("error.registro.confirmacionEmail"));
        }

        /* Contrasena */
        if ( contrasena == null ||contrasena.length() == 0) { 
            errors.add("contrasena", new ActionMessage("error.registro.contrasena")); 
        }
        else if(contrasena.length()<8){
            errors.add("contrasena", new ActionMessage("error.registro.contrasenaCorrecto")); 
        }
        
        /* Contrasena confimacion */
        if ( contrasenaDos == null ||contrasenaDos.length() == 0) { 
            errors.add("contrasenaDos", new ActionMessage("error.registro.contrasenaDos")); 
        }
        else if(contrasenaDos.length()<8){
            errors.add("contrasenaDos", new ActionMessage("error.registro.contrasenaDosCorrecto"));
        }
        
        /* Contrasena iguales */
        if ( !contrasena.equals(contrasenaDos) ) {
            errors.add("confirmacionContrasena", new ActionMessage("error.registro.confirmacionContrasena"));
        }

        /* Nombre */
        if ( nombre == null ||nombre.length() == 0) { 
            errors.add("nombre", new ActionMessage("error.registro.nombre")); 
        }
        else if(!nombre.matches("[a-zA-Z]+")){
            errors.add("nombre", new ActionMessage("error.registro.nombreCorrecto"));
        }

        if ( apellido == null ||apellido.length() == 0) { 
            errors.add("apellido", new ActionMessage("error.registro.apellido")); 
        }
        else if(!apellido.matches("[a-zA-Z]+")){
            errors.add("apellido", new ActionMessage("error.registro.apellidoCorrecto"));
        }
        
        if ( municipio == null ||municipio.length() == 0) { 
            errors.add("municipio", new ActionMessage("error.registro.municipio")); 
        }
        
        if ( niff == null ||niff.length() == 0) { 
            errors.add("niff", new ActionMessage("error.registro.niff")); 
        }
        else if(!niff.matches("[0-9]{8}[a-zA-Z]{1}")){
            errors.add("niff", new ActionMessage("error.registro.apellido.niffCorrecto"));
        }
        
        if ( telefono == null ||telefono.length() == 0) { 
            errors.add("telefono", new ActionMessage("error.registro.telefono")); 
        }
        else if(!telefono.matches("[0-9]{9}")){
            errors.add("telefono", new ActionMessage("error.registro.apellido.telefonoCorrecto"));
        }

        return errors;
    }
}

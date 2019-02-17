/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class NewStrutsActionForm extends org.apache.struts.action.ActionForm {
    
    private String nombre, apellido, email, cp, login, password, confirmapassword,
            comedia, musical, aventura, policiaco, clasico, melodrama, opcion ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmapassword() {
        return confirmapassword;
    }

    public void setConfirmapassword(String confirmapassword) {
        this.confirmapassword = confirmapassword;
    }

    public String getComedia() {
        return comedia;
    }

    public void setComedia(String comedia) {
        this.comedia = comedia;
    }

    public String getMusical() {
        return musical;
    }

    public void setMusical(String musical) {
        this.musical = musical;
    }

    public String getAventura() {
        return aventura;
    }

    public void setAventura(String aventura) {
        this.aventura = aventura;
    }

    public String getPoliciaco() {
        return policiaco;
    }

    public void setPoliciaco(String policiaco) {
        this.policiaco = policiaco;
    }

    public String getClasico() {
        return clasico;
    }

    public void setClasico(String clasico) {
        this.clasico = clasico;
    }

    public String getMelodrama() {
        return melodrama;
    }

    public void setMelodrama(String melodrama) {
        this.melodrama = melodrama;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    /**
     *
     */
    public NewStrutsActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (nombre == null || nombre.length() == 0) {
            errors.add("nombre", new ActionMessage("error.login.nombre"));
        }
        if (apellido == null || apellido.length() == 0) {
            errors.add("apellido", new ActionMessage("error.login.apellido"));
        }
        if (email == null || email.length() == 0) {
            errors.add("email", new ActionMessage("error.login.email"));
        }
        if (cp == null || cp.length() < 5) {
            errors.add("cp", new ActionMessage("error.login.cp"));
        }
        if (login == null || login.length() == 0) {
            errors.add("login", new ActionMessage("error.login.login"));
        }
        if (password == null || password.length() == 0) {
            errors.add("password", new ActionMessage("error.login.password"));
        }
        if (confirmapassword == null || confirmapassword.length() == 0) {
            errors.add("confirmapassword", new ActionMessage("error.login.confirmapassword"));
        }
        if (!password.equals(confirmapassword)) {
            errors.add("confirmacion", new ActionMessage("error.login2"));
        }

        return errors;
    }
    
    public void reset ()
    {
        this.nombre = null;
        this.apellido = null;
        this.email = null;
        this.password = null;
        this.confirmapassword = null;
        this.cp = null;
    }
    
}

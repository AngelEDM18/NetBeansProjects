package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class FormularioForm extends org.apache.struts.action.ActionForm {

    private String nombre;
    private String apellidos;
    private String clave;
    private String claveConfirmacion;
//métodos getters y setters del formulario

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClaveConfirmacion() {
        return claveConfirmacion;
    }

    public void setClaveConfirmacion(String claveConfirmacion) {
        this.claveConfirmacion = claveConfirmacion;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) { //creamos un nuevo objeto ActionErrors
        ActionErrors errores = new ActionErrors();
        if (nombre == null || nombre.length() == 0) {
            errores.add("nombre", new ActionMessage("error.login.nombre"));
        }
        if (apellidos == null || apellidos.length() == 0) {
            errores.add("apellidos", new ActionMessage("error.login.apellidos"));
        }
        if (clave == null || clave.length() == 0) {
            errores.add("clave", new ActionMessage("error.login.clave"));
        }
        if (claveConfirmacion == null || claveConfirmacion.length() == 0) {
            errores.add("claveConfirmacion", new ActionMessage("error.login.claveConfirmacion"));
        }
        if (!clave.equals(claveConfirmacion)) {
            errores.add("confirmacion", new ActionMessage("error.login2"));
        }
        return errores;
    }

    public void reset() {
        this.nombre = null;
        this.apellidos = null;
        this.claveConfirmacion = null;
        this.clave = null;
    }
}

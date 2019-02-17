package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AccionLogin extends org.apache.struts.action.Action {

    private String resultado; // creación del método execute

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception { //si el usuario pulsa el botón de cancelado
        if (this.isCancelled(request)) { //como tenemos en el método execute el objeto ActionMapging podemos mandar a un reenvio del struts-config
            return mapping.findForward("cancelada");
        } else { //creamos un objeto formularioForm
            FormularioForm formularioform = (FormularioForm) form;
            return mapping.findForward("satisfactoria");
        }
    }
}

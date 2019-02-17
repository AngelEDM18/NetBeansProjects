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
public class Pizza {

    int id;
    String nompizzas;
    int idpizza;

    public Pizza(int id, String nompizzas, int idpizza) {
        this.setId(id);
        this.setNompizzas(nompizzas);
        this.setIdpizza(idpizza);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNompizzas() {
        return nompizzas;
    }

    public void setNompizzas(String nompizzas) {
        this.nompizzas = nompizzas;
    }

    public int getIdpizza() {
        return idpizza;
    }

    public void setIdpizza(int idpizza) {
        this.idpizza = idpizza;
    }
}

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
public class Store {

    int store_id, manager_staff_id, address_id;
    String last_update, nombre;

    public Store(int store_id, int manager_staff_id, int address_id, String last_update, String nombre) {
        this.setStore_id(store_id);
        this.setManager_staff_id(manager_staff_id);
        this.setAddress_id(address_id);
        this.setLast_update(last_update);
        this.setNombre(nombre);
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getManager_staff_id() {
        return manager_staff_id;
    }

    public void setManager_staff_id(int manager_staff_id) {
        this.manager_staff_id = manager_staff_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

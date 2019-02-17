/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DOCENTRO
 */
public class Usuario {

    int id;
    String User_name, User_password, User_address, User_email, User_Phone, Nombre, Apellidos;

    public Usuario(int id, String User_name, String User_password, String User_address, String User_email, String User_Phone, String Nombre, String Apellidos) {
        this.setId(id);
        this.setUser_name(User_name);
        this.setUser_password(User_password);
        this.setUser_address(User_address);
        this.setUser_email(User_email);
        this.setUser_Phone(User_Phone);
        this.setNombre(Nombre);
        this.setApellidos(Apellidos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    public String getUser_password() {
        return User_password;
    }

    public void setUser_password(String User_password) {
        this.User_password = User_password;
    }

    public String getUser_address() {
        return User_address;
    }

    public void setUser_address(String User_address) {
        this.User_address = User_address;
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String User_email) {
        this.User_email = User_email;
    }

    public String getUser_Phone() {
        return User_Phone;
    }

    public void setUser_Phone(String User_Phone) {
        this.User_Phone = User_Phone;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
}

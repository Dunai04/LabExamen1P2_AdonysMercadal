/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen1p2adonysmercadal;

import java.util.Date;

/**
 *
 * @author adony
 */
public class Usuarios {
    protected String nombre;
    protected String apellido;
    protected String contrasena;
    protected Date fechaDeNaci;
    protected String sexo;
    protected String departamento;
    protected String numeroID;

    public Usuarios(String nombre, String apellido, String contrasena, Date fechaDeNaci, String sexo, String departamento, String numeroID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.fechaDeNaci = fechaDeNaci;
        this.sexo = sexo;
        this.departamento = departamento;
        this.numeroID = numeroID;
    }


    public Usuarios() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setFechaDeNaci(Date fechaDeNaci) {
        this.fechaDeNaci = fechaDeNaci;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Date getFechaDeNaci() {
        return fechaDeNaci;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }
    
    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena + ", fechaDeNaci=" + fechaDeNaci + ", sexo=" + sexo + ", departamento=" + departamento + ", numeroID=" + numeroID + '}';
    }
    
    
}

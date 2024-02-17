/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen1p2adonysmercadal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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

    public Usuarios(String nombre, String apellido, String contrasena, Date fechaDeNaci, String sexo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.fechaDeNaci = fechaDeNaci;
        this.sexo = sexo;
        this.departamento = departamento;
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

    public void setNumeroID() {
        this.numeroID = gennumID();
    }

    public String gennumID() {
        String depar;
        String muni;
        String anonaci;
        String numrand;
        switch (this.departamento) {
            case "Francisco Morazan":
                depar = "01";
                muni = numrand(28);
                break;
            case "Cortes":
                depar = "02";
                muni = numrand(12);
                break;
            case "Comayagua":
                depar = "03";
                muni = numrand(21);
                break;
            default:
                depar = "--no c como validar xd";
                muni = ":)";
        }
        String ano = new SimpleDateFormat("yyyy").format(this.fechaDeNaci);
        String numerandom = numrand(100000000);//por mame
        return "0" + depar + muni + ano + numerandom;
    }

    public String numrand(int limite) {
        int numero = new Random().nextInt(limite) + 1;
        String numconv;
        if (numero < 10) {
            numconv= "0" + numero;
        } else {
            numconv = Integer.toString(numero);
        }
        return numconv;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena + ", fechaDeNaci=" + fechaDeNaci + ", sexo=" + sexo + ", departamento=" + departamento + ", numeroID=" + numeroID + '}';
    }

}

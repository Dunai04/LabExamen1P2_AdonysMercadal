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
public class Empleados extends Usuarios {
    private String Carrera;
    private String puestoaLaboral;
    private Date anos;

    public Empleados(String Carrera, String puestoaLaboral, Date anos, String nombre, String apellido, String contrasena, Date fechaDeNaci, String sexo, String departamento, String numeroID) {
        super(nombre, apellido, contrasena, fechaDeNaci, sexo, departamento, numeroID);
        this.Carrera = Carrera;
        this.puestoaLaboral = puestoaLaboral;
        this.anos = anos;
    }

    public Empleados() {
    }

    
    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getPuestoaLaboral() {
        return puestoaLaboral;
    }

    public void setPuestoaLaboral(String puestoaLaboral) {
        this.puestoaLaboral = puestoaLaboral;
    }

    public Date getAnos() {
        return anos;
    }

    public void setAnos(Date anos) {
        this.anos = anos;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleados{" + "Carrera=" + Carrera + ", puestoaLaboral=" + puestoaLaboral + ", Años=" + anos + '}';
    }

    
}

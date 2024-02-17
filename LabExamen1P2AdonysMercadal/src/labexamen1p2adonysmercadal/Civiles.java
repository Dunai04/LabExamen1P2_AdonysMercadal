/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen1p2adonysmercadal;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adony
 */
public class Civiles extends Usuarios{
    private ArrayList <Tramites> Tramites = new ArrayList();

    public void setTramites(ArrayList<Tramites> Tramites) {
        this.Tramites = Tramites;
    }

    public ArrayList<Tramites> getTramites() {
        return Tramites;
    }

    public Civiles(String nombre, String apellido, String contrasena, Date fechaDeNaci, String sexo, String departamento) {
        super(nombre, apellido, contrasena, fechaDeNaci, sexo, departamento);
    }
    
}

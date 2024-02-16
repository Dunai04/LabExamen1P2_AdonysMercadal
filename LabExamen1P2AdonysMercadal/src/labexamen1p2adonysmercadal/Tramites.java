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
public class Tramites {
    String nembre;
    String descripcion;
    Date FechaSoli;
    String identidad;

    public Tramites() {
    }

    public Tramites(String nembre, String descripcion, Date FechaSoli, String identidad) {
        this.nembre = nembre;
        this.descripcion = descripcion;
        this.FechaSoli = FechaSoli;
        this.identidad = identidad;
    }

    public String getNembre() {
        return nembre;
    }

    public void setNembre(String nembre) {
        this.nembre = nembre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaSoli() {
        return FechaSoli;
    }

    public void setFechaSoli(Date FechaSoli) {
        this.FechaSoli = FechaSoli;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Tramites{" + "nombre=" + nembre + ", descripcion=" + descripcion + ", FechaSoli=" + FechaSoli + ", identidad=" + identidad + '}';
    }
    
}

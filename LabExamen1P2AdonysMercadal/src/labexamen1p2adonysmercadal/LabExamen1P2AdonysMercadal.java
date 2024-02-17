/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexamen1p2adonysmercadal;
//Fila314 //nombres empleado "Adonys Mercadal" contra "123" y civiles "Venus Lobo" y contra "456" ni modo intente no soporte <3

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author adony
 */
public class LabExamen1P2AdonysMercadal {

    /**
     * @param args the command line arguments
     */
    public static  ArrayList<Usuarios> listausu = new ArrayList<>();
    public static void main(String[] args) {
        login login = new login();
        login.setVisible(true);
        Date fechadunai = new Date(2004, 9, 04);
        Date anostradunai = new Date(2010, 2, 20);
        Date fechavenu = new Date(2006, 6, 04);
        Empleados empleado1 = new Empleados("Lic", "Gerente", anostradunai, "Adonys", "Mercadal", "123", fechadunai, "Masculino", "Francisco Morazan");
        empleado1.setNumeroID();
        listausu.add(empleado1);
        Civiles civil1 = new Civiles("Venus", "Lobo", "456", fechavenu, "Femenino", "Cortes");
        civil1.setNumeroID();
        listausu.add(civil1);
    }
    
}

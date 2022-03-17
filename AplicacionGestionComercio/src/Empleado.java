/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Empleado /*extends Comercio*/{
    private String nombre;
    private double sueldo;
    
    //Constructor principal
    public Empleado(String n, double s){
        nombre=n;
        sueldo=s;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    
}

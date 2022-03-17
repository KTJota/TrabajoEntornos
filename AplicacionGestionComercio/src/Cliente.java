/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cliente /*extends Comercio*/{
    private String nombre;
    private double factura;
    private String direccion;
    private String telefono;
    
    
    //Constructor principal
    public Cliente(String n, double f, String d, String t){
        nombre=n;
        factura=f;
        direccion=d;
        telefono=t;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getFactura() {
        return factura;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
}

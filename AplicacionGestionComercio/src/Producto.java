/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmuela
 */
public abstract class Producto {  //texto de prueba 232
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String n, double p, int c){
        nombre = n;
        precio = p;
        cantidad = c;
    }
    
    public String getNombre(){
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}

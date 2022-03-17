/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author dani0
 */
public class Comercio {
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Producto> productos;
    private String nombre;
    private double ganancias;
    private double perdidas;
    
    
    public Comercio(String n, double g, double p){
        nombre=n;
        ganancias=g;
        perdidas=p;
        clientes=new ArrayList<>();
        empleados=new ArrayList<>();
        productos=new ArrayList<>();
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getGanancias() {
        return ganancias;
    }

    public double getPerdidas() {
        return perdidas;
    }
    
    
}

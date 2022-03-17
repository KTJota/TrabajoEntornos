
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Ordenador extends Producto {
    
    /**
     * Almacena el tamaño (int) del ordenador
     */
    private int tamaño;
    
    /**
     * Guarda los componentes (ArrayList) del ordenador
     */
    private ArrayList<String> componentes;
    
    
    /**
     * Constructor de la clae
     * @param n Nombre (String) del producto
     * @param p precio (double) del producto
     * @param c Cantidad (int) del producto
     * @param t Tamaño (int) del ordenador
     */
    public Ordenador(String n, double p, int c, int t){
        
        super(n,p,c);
        tamaño=t;
        componentes=new ArrayList<>();
        
    }
    
    /**
     * 
     * @return Tamaño (int) del ordenador
     */
    public int getTamaño(){
        return tamaño;
    }
    
    
    /**
     * 
     * @return Un String con todos los componentes del ordenador
     */
    public String getComponentes(){
        StringBuilder sb= new StringBuilder();
        sb.append("Los componentes son : \n");
        for (int i = 0; i < componentes.size(); i++) {
            
            sb.append("- "+componentes.get(i)+"\n");
            
        }
        
        return sb.toString();
    }
    
}
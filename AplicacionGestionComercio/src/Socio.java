/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan To
 */
public class Socio extends Cliente{
    private boolean socio;
    public Socio(String n, double f, String d, String t){
        super(n,f,d,t);
        socio=false;
    }
    public void hacerSocio(){
        socio=true;
    }
    public boolean esSocio(){
        return socio;
    }
    
}

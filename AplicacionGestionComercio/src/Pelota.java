
/**
 *
 * @author Rafa Ariza
 */
public class Pelota extends Producto {
    
    private int tamaño;
    private String color;
    private String tipo;
    
    public Pelota(String n, double p, int c, int t, String col, String tip){
        super(n,p,c);
        tamaño=t;
        color=col;
        tipo=tip;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getTipo(){
        return tipo;
    }
}

public class Libro extends Producto{
    private String autor;
    private int paginas;
    private String tipo;
    
    public Libro(String n, double p, int c, String aut, int pag, String tip){
        super(n,p,c);
        autor=aut;
        paginas=pag;
        tipo=tip;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTipo() {
        return tipo;
    }
}

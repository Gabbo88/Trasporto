package progtrasporti;

/**
 *
 * @author gabri
 */
public class Trasporto {
    protected String marca, modello, n_serie;
    protected int posti;
    protected boolean occupato;
    protected double prezzoOrario;
    
    public Trasporto(String marca, String modello, String n_serie, int posti, double prezzoOrario, boolean occupato){
        this.marca = marca;
        this.modello = modello;
        this.n_serie = n_serie;
        this.posti = posti;
        this.prezzoOrario = prezzoOrario;
        this.occupato = occupato;
    }
    
    public Trasporto(int posti, double prezzoOrario, boolean occupato){
        this.posti = posti;
        this.prezzoOrario = prezzoOrario;
        this.occupato = occupato;
    }

    public String getN_serie() {
        return n_serie;
    }
    
    public String toString(){
        if(occupato==false)
        return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: libero\n";
        if(occupato==true)
        return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
        
        return "ciao";
    }
}

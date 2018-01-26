package progtrasporti;

/**
 *
 * @author gabri
 */
public class Bicicletta extends Trasporto {
    protected int ruote;
    protected boolean luci, cambio;
    
    public Bicicletta(String marca, String modello, String n_serie, int posti, int ruote, double prezzoOrario, boolean occupato){
        super(marca, modello, n_serie, posti, prezzoOrario, occupato);
        this.ruote = ruote;  
    }
    
    public void setLuci(boolean luci){
        this.luci = luci;
    }
    
    public void setCambio(boolean cambio){
        this.cambio = cambio;
    }

    public boolean getLuci() {
        return luci;
    }

    public boolean getCambio() {
        return cambio;
    }
    
    public String toString(){
        if(occupato==false && luci==false && cambio==false)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: no\nCambio: no\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: libero\n";
        if(occupato==false && luci==false && cambio==true)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: no\nCambio: si\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: libero\n";
        if(occupato==false && luci==true && cambio==true)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: si\nCambio: si\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: libero\n";
        if(occupato==false && luci==true && cambio==false) 
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: si\nCambio: no\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: libero\n";
        if(occupato==true && luci==false && cambio==true)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: si\nCambio: no\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
        if(occupato==true && luci==true && cambio==true)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: si\nCambio: si\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
        if(occupato==true && luci==false && cambio==false)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: no\nCambio: no\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
        if(occupato==true && luci==true && cambio==false)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: si\nCambio: no\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
        if(occupato==true && luci==false && cambio==false)
            return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nNumero di ruote: "+ruote+"\nLuci: no\nCambio: no\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
                    
        return "ciao";
    }
    
}

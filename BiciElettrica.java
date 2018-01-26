package progtrasporti;

/**
 *
 * @author gabri
 */
public class BiciElettrica extends Bicicletta{
    
    private boolean alElettrica;
    private float v_max=0;
    
    public BiciElettrica(String marca, String modello, String n_serie, int posti, int ruote, double prezzoOrario, boolean occupato){
        super(marca, modello, n_serie, posti, ruote = 2, prezzoOrario, occupato);
        luci = true;
        alElettrica = true;
    }

    public float getV_max() {
        return v_max;
    }

    public void setV_max(float v_max) {
        this.v_max = v_max;
    }
    
    public String toString(){
        if(occupato==false && v_max == 0)
             return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nVelocità massima: non specificata\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: libero\n";
        if(occupato==true && v_max == 0)
             return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nVelocità massima: non specificata\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
        if(occupato==true && v_max!=0)
             return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nVelocità massima: "+v_max+"\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: occupato\n";
        if(occupato==false && v_max!=0)
             return "Marca: " + marca+"\nModello: "+modello+"\nNumero di serie: "+n_serie+"\nNumero di posti: "+posti+"\nVelocità massima: "+v_max+"\nPrezzo di affitto orario: "+prezzoOrario+" €"+"\nStato del mezzo: libero\n";
        return "ciao";
    }
}

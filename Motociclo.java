package progtrasporti;

/**
 *
 * @author gabri
 */
public class Motociclo extends Trasporto{
    private int ruote, cilindrata;
    private String alimentazione;
    private float v_max;
    protected boolean luci;

    public Motociclo(String marca, String modello, String n_serie, int posti, double prezzoOrario, boolean occupato, int cilindrata){
        super(marca, modello, n_serie, posti, prezzoOrario, occupato);
        this.ruote = 2;
        this.cilindrata = cilindrata;
        alimentazione = "benzina";
        luci = true;
    }   

    public float getV_max() {
        return v_max;
    }

    public void setV_max(float v_max) {
        this.v_max = v_max;
    }
    
    
    
}

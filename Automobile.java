package progtrasporti;

/**
 *
 * @author gabri
 */
public class Automobile extends Trasporto {
    private int ruote, cilindrata;
    private String alimentazione;
    private float v_max;    
    private boolean luci;
    
    public Automobile(String marca, String modello, String n_serie, int posti, double prezzoOrario, boolean occupato, int cilindrata, String alimentazione){
        super(marca, modello, n_serie, posti, prezzoOrario, occupato);
        ruote = 4;
        this.cilindrata = cilindrata;
        this.alimentazione = alimentazione;
        luci = true;
    }

    public float getV_max() {
        return v_max;
    }

    public void setV_max(float v_max) {
        this.v_max = v_max;
    }
    
}

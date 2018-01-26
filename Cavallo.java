package progtrasporti;

/**
 *
 * @author gabri
 */
public class Cavallo extends Trasporto{
    private String nome;
    private int pausa_bere;
    
    public Cavallo(String nome, int posti, int pausa_bere, double prezzoOrario, boolean occupato){
        super(posti, prezzoOrario, occupato);
        this.nome = nome;
        this.pausa_bere = pausa_bere;
    }

    public String getNome() {
        return nome;
    }
    
    public String toString(){
        if(occupato==false)
            return"Nome del cavallo: "+nome+"\nNumero di posti: "+posti+"\nIl cavallo deve bere ogni: "+pausa_bere+" ora/e"+"\nPrezzo di affitto orario: "+prezzoOrario+"\nStato del mezzo: libero\n";
        if(occupato==true)
            return"Nome del cavallo: "+nome+"\nNumero di posti: "+posti+"\nIl cavallo deve bere ogni: "+pausa_bere+" ora/e"+"\nPrezzo di affitto orario: "+prezzoOrario+"\nStato del mezzo: occupato\n";
        return "addiosss";
    }
}

package progtrasporti;
import input.Input;
import java.util.*;

/**
 *
 * @author gabri
 */

/**25/01/2018            
 * Aggiungere al toString di BiciElettrica altri 2 if; 
 * 
 * 26/01/2018 
 * fatto appunto del 25/01
 * completati i metodi per aggiungere un oggetto all'ArrayList
 */
public class ProgTrasporti {
    
    public static Bicicletta insBici(ArrayList ar){
        Bicicletta bici;
        String marca, modello, n_serie;
        int posti, ruote;
        double prezzoOrario;
        boolean occupato, cambio, luci;
        
        marca = Input.insStringa("Inserisci la marca della bicicletta: ");
        modello = Input.insStringa("Inserisci il modello: ");
        n_serie = Input.insStringa("Inserisci il numero di serie: ");
        posti = Input.insInt("Inserisci il numero di posti presenti sulla bici (da 1 a 2): ");
        ruote = Input.insInt("Inserisci numero di ruote presenti sulla bici: ");
        luci = Input.insBoolean("La bici ha le luci? (Si/No): ");
        cambio = Input.insBoolean("La bici ha il cambio? (Si/No): ");
        prezzoOrario = Input.insDouble("Inserisci il prezzo orario di affitto: ");
        occupato = Input.insBoolean("Il mezzo è occuapato? (Si/No): ");
        
        bici = new Bicicletta(marca, modello, n_serie, posti, ruote, prezzoOrario, occupato);
        
        if(luci)
            bici.setLuci(luci);
        if(cambio)
            bici.setCambio(cambio);
        
        return bici;
    }

    public static BiciElettrica insBiciElettrica(ArrayList ar){
        BiciElettrica biciel;
        String marca, modello, n_serie;
        int posti, ruote=2;
        float v_max;
        double prezzoOrario;
        boolean occupato, velocita;
        
        marca = Input.insStringa("Inserisci la marca della bicicletta: ");
        modello = Input.insStringa("Inserisci il modello: ");
        n_serie = Input.insStringa("Inserisci il numero di serie: ");
        posti = Input.insInt("Inserisci il numero di posti presenti sulla bici (da 1 a 2): ");
        prezzoOrario = Input.insDouble("Inserisci il prezzo orario di affitto: ");
        occupato = Input.insBoolean("Il mezzo è occuapato? (Si/No)");
        
        biciel = new BiciElettrica(marca, modello, n_serie, posti, ruote, prezzoOrario, occupato);
         
        velocita = Input.insBoolean("Vuoi specificare la velocità massima raggiunta dal veicolo? (Si/No): ");
        if(velocita){
            v_max = Input.insFloat("Inserisci velocità massima del veicolo: ");
            biciel.setV_max(v_max);
        }
        return biciel;
    }
    
    public static Motociclo insMotociclo(ArrayList ar){
        Motociclo moto;
        String marca, modello, n_serie;
        int posti, cilindrata;
        float v_max;
        double prezzoOrario;
        boolean occupato, velocita;
        
        marca = Input.insStringa("Inserisci la marca della bicicletta: ");
        modello = Input.insStringa("Inserisci il modello: ");
        n_serie = Input.insStringa("Inserisci il numero di serie: ");
        posti = Input.insInt("Inserisci il numero di posti presenti sulla bici (da 1 a 2): ");
        prezzoOrario = Input.insDouble("Inserisci il prezzo orario di affitto: ");
        cilindrata = Input.insInt("Inserisci la cilindrata della moto: ");
        occupato = Input.insBoolean("Il mezzo è occuapato? (Si/No)");
        
        moto = new Motociclo(marca, modello, n_serie, posti, prezzoOrario, occupato, cilindrata);
        
        velocita = Input.insBoolean("Vuoi specificare la velocità massima raggiunta dal veicolo? (Si/No): ");
        if(velocita){
            v_max = Input.insFloat("Inserisci velocità massima del veicolo: ");
            moto.setV_max(v_max);
        }
        
        return moto;
    }
    
    public static Automobile insAutomobile(ArrayList ar){
        Automobile auto;
        String marca, modello, alimentazione, n_serie;
        int posti, cilindrata;
        float v_max;
        double prezzoOrario;
        boolean occupato, velocita;
        
        marca = Input.insStringa("Inserisci la marca della bicicletta: ");
        modello = Input.insStringa("Inserisci il modello: ");
        n_serie = Input.insStringa("Inserisci il numero di serie: ");
        posti = Input.insInt("Inserisci il numero di posti presenti sulla bici (da 1 a 2): ");
        cilindrata = Input.insInt("Inserisci la cilindrata della moto: ");
        alimentazione = Input.insStringa("L'auto va a benzina o diesel? Inserisci una risposta: ");
        prezzoOrario = Input.insDouble("Inserisci il prezzo orario di affitto: ");
        occupato = Input.insBoolean("Il mezzo è occuapato? (Si/No)");
  
        auto = new Automobile(marca, modello, n_serie, posti, prezzoOrario, occupato, cilindrata, alimentazione);
        
        velocita = Input.insBoolean("Vuoi specificare la velocità massima raggiunta dal veicolo? (Si/No): ");
        if(velocita){
            v_max = Input.insFloat("Inserisci velocità massima del veicolo: ");
            auto.setV_max(v_max);
        }
        
        return auto;
    }
    
    public static Cavallo insCavallo(ArrayList ar){
        Cavallo cavallo;
        String nome;
        int posti, pausa_bere;
        double prezzoOrario;
        boolean occupato;
        
        nome = Input.insStringa("Inserisci il nome del cavallo: ");
        posti = Input.insInt("Inserisci il numero di persone che possono salire sul cavallo (da 1 a 2): ", 1, 2, "Inserisci un numero valido! (da 1 a 2): ");
        pausa_bere = Input.insInt("Ogni quanto il cavallo ha bisogno di una pausa per bere? : ");
        prezzoOrario = Input.insDouble("Inserisci il prezzo orario di affitto: ");
        occupato = Input.insBoolean("Il cavallo è occuapato? (Si/No)");
        
        return cavallo = new Cavallo(nome, posti, pausa_bere, prezzoOrario, occupato);
    }
    
    public static Object ricerca(ArrayList ar, String stringa){
        
        
        for(int i=0; i<ar.size(); i++){
            if(ar.get(i) instanceof Bicicletta){
                Bicicletta elementAt = (Bicicletta) ar.get(i);
                if(elementAt.getN_serie().equals(stringa)){
                    return ar.get(i);
                }
            }
            if(ar.get(i) instanceof BiciElettrica){
                BiciElettrica elementAt = (BiciElettrica) ar.get(i);
                if(elementAt.getN_serie().equals(stringa)){
                    return ar.get(i);
                }
            }
            if(ar.get(i) instanceof Motociclo){
                Motociclo elementAt = (Motociclo) ar.get(i);
                if(elementAt.getN_serie().equals(stringa)){
                    return ar.get(i);
                }    
            }
            if(ar.get(i) instanceof Automobile){
                Automobile elementAt = (Automobile) ar.get(i);
                if(elementAt.getN_serie().equals(stringa)){
                    return ar.get(i);
                }
            }
            if(ar.get(i) instanceof Cavallo){
                Cavallo elementAt = (Cavallo) ar.get(i);
                if(elementAt.getNome().equals(stringa)){
                    return ar.get(i);
                }
            }
        }
       return null; 
    }
    
    public static void main(String[] args) {
        int cont=1, risp;
        String cerca;
        boolean esci=false, occupato;
        Object o;
        ArrayList trasporti = new ArrayList();
        ArrayList stampa = new ArrayList();
        do{
            risp = Input.insInt("Inserisci un tipo di trasporto: \n"
                +"1. Bicicletta\n"
                +"2. Bicicletta elettrica\n"
                +"3. Motociclo\n"
                +"4. Automobile\n"
                +"5. Cavallo\n"
                +"6. Resoconto\n"
                +"7. Ricerca tramite numero di serie o nome(cavalli)\n"
                +"8. Modifica prezzo di affitto orario di un mezzo\n"
                +"9. Esci\n"
                +"Fai una scelta (da 1 a 9)");
            switch(risp){
                case 1:
                    trasporti.add(insBici(trasporti));
                    break;
                case 2:
                    trasporti.add(insBiciElettrica(trasporti));
                    break;
                case 3:
                    trasporti.add(insMotociclo(trasporti));
                    break;
                case 4:
                    trasporti.add(insAutomobile(trasporti));
                    break;
                case 5:
                    trasporti.add(insCavallo(trasporti));
                    break;
                case 6:
                    Iterator i = trasporti.iterator();
                    while(i.hasNext()){   
                        System.out.println("MEZZO DI TRASPORTO N."+ cont);
                        System.out.println(i.next());
                        System.out.println("----------------------------------");
                        cont++;
                    }
                    break;
                case 7:
                    cerca = Input.insStringa("Inserisci il numero di serie del mezzo o il nome(cavalli): ");
                    o = ricerca(trasporti, cerca);
                    if(o==null){
                        System.out.println("Mezzo di trasporto non trovato!");
                    }
                    else{
                        stampa.add(o);
                        Iterator a = stampa.iterator();
                        while(a.hasNext()){
                            System.out.println(a.next());
                        }
                        stampa.remove(o);
                    }     
                    break;
                case 9:
                    esci=true;
            }
            
        }while(!esci);
    } 
}
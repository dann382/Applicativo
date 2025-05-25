package model;
import controller.Controller;
import java.util.ArrayList;
public class UtenteGenerico extends Utenti {

    //public void prenotazioneVolo(String codiceVolo){}

    //public void ricercaVolo(String destinazione){}

    //public void modificaPrenotazione(String nominativo, String codiceVolo){}


    private Controller controller;

    public UtenteGenerico(String username, String password, Controller controller) {
        super(username, password);
        this.controller = controller;
    }

    public void prenotazioneVolo(String codiceVolo, Passeggero p){
        controller.creaPrenotazione(p, codiceVolo);
    }

    public ArrayList ricercaVolo(String destinazione){
        return controller.cercaVoli(destinazione);
        //return risultati;
    }

    public void modificaPrenotazione(Passeggero p, String numeroBiglietto, Passeggero nuovoPasseggero, String nuovoNumeroBiglietto) {
        controller.modificaPrenotazione(p, numeroBiglietto, nuovoPasseggero, nuovoNumeroBiglietto);
    }



}

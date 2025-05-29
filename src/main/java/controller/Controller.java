package controller;
import model.Voli;
import model.Gate;
import model.Passeggero;
import model.Prenotazione;
import model.Utenti;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Voli> voli;
    private ArrayList<Prenotazione> prenotazioni;
    private ArrayList<Gate> listaGate;

    public Controller() {
        voli = new ArrayList<>();
        prenotazioni = new ArrayList<>();
    }

    public void popolaVoli(){
        Voli volo = new Voli("15", "Napoli", "Palermo", "Aereo",
                LocalDate.of(2025, 05, 12), LocalTime.of(15, 30));
        Voli volo2 = new Voli("11A", "Napoli", "Lugano", "Aereo",
                LocalDate.of(2025, 05, 16), LocalTime.of(17, 30));

        voli.add(volo);
        voli.add(volo2);
    }

    public void creaPrenotazione(Passeggero passeggero, String codiceVolo) {
        for (Voli voli : voli) {
            if (voli.getCodiceVolo().equals(codiceVolo)) {
                Prenotazione p = new Prenotazione(passeggero, voli, "12A", "1234");
                prenotazioni.add(p);
            }
        }
    }

    public void modificaPrenotazione(Passeggero passeggero, String numeroBiglietto, Passeggero nuovoPasseggero, String nuovoNumeroBiglietto) {
        for (Prenotazione prenotazione : prenotazioni) {
            if(prenotazione.getPasseggero().equals(passeggero)){
                prenotazione.setPasseggero(nuovoPasseggero);
                prenotazione.setNumeroBiglietto(nuovoNumeroBiglietto);
            }
        }
    }

    public ArrayList<Voli> cercaVoli(String destinazione) {
        ArrayList<Voli> ricerca = new ArrayList<>();
        for (Voli voli : voli) {
            if (voli.getDestinazione().equals(destinazione)) {
                ricerca.add(voli);
            }
        }
        return ricerca;

    }

    public ArrayList<Voli> visualizzaVoli(){
        return voli;
    }

    public void aggiungiVolo(Voli volo) {
        boolean isNew = true;
        for (Voli voli : voli) {
            if (voli.getCodiceVolo().equals(volo.getCodiceVolo())) {
                isNew = false;
            }
        }
        if(isNew){
            voli.add(volo);
        }
    }

    public void aggiornaVolo(String codiceVolo, Voli nuovoVolo) {
        for (int i = 0; i < voli.size(); i++) {
            if (voli.get(i).getCodiceVolo().equals(codiceVolo)) {
                voli.set(i, nuovoVolo);
            }
        }
    }

    public void assegnaGate(String codiceVolo, Gate gate) {
        for (Gate g : listaGate) {
            if (g.isLibero()){
                for (Voli v : voli){
                    if (v.getCodiceVolo().equals(codiceVolo)){
                        v.setGate(gate);
                        gate.setLibero(false);
                    }
                }
            }
        }
    }

    public boolean isAdmin(String username, String password) {
        return username.equals("admin") && password.equals("1234");
    }

}

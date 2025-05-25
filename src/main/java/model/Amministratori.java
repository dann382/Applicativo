package model;
import controller.Controller;

public class Amministratori extends Utenti{

    private Controller controller;

    public Amministratori(String username, String password, Controller controller) {
        super(username, password);
        this.controller = controller;
    }

    public void aggiungiVolo(Voli volo){
        controller.aggiungiVolo(volo);
    }

    public void aggiornaVolo(String codiceVolo, Voli nuovoVolo){
        controller.aggiornaVolo(codiceVolo, nuovoVolo);
    }

    public void assegnaGate(String codiceVolo, Gate gate){
        controller.assegnaGate(codiceVolo, gate);
    }

}

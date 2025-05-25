package model;
import controller.Controller;


public class Prenotazione {
    private Passeggero passeggero;
    private Voli volo;
    private String postoAssegnato;
    private String numeroBiglietto;
    private StatoPrenotazione stato;

    public Prenotazione(Passeggero passeggero, Voli volo, String postoAssegnato, String numeroBiglietto) {
        this.passeggero = passeggero;
        this.volo = volo;
        this.postoAssegnato = postoAssegnato;
        this.numeroBiglietto = numeroBiglietto;
    }

    public Passeggero getPasseggero() {
        return passeggero;
    }
    public void setPasseggero(Passeggero passeggero) {
        this.passeggero = passeggero;
    }

    public String getPostoAssegnato() {
        return postoAssegnato;
    }

    public void setPostoAssegnato(String postoAssegnato) {
        this.postoAssegnato = postoAssegnato;
    }

    public String getNumeroBiglietto() {
        return numeroBiglietto;
    }

    public void setNumeroBiglietto(String numeroBiglietto) {
        this.numeroBiglietto = numeroBiglietto;
    }

    public StatoPrenotazione getStato() {
        return stato;
    }

    public void setStato(StatoPrenotazione stato) {
        this.stato = stato;
    }

    public String toString(){
        return "Prenotazione:\n Nome: " + passeggero + "\nPosto Assegnato: " + postoAssegnato + "\nNumero Biglietto: " + numeroBiglietto
                + "\nStato Prenotazione: " + stato + "\n Volo: " + volo;
    }
}

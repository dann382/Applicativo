package model;
import java.time.LocalDate;
import java.time.LocalTime;

public class Voli {
    private String codiceVolo;
    private String provenienza;
    private String destinazione;
    private String compagniaAerea;
    private LocalDate dataPartenza;
    private LocalTime orarioPartenza;
    private StatoVolo stato;

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    private Gate gate;

    public Voli(String codiceVolo, String provenienza, String destinazione, String compagniaAerea, LocalDate dataPartenza, LocalTime orarioPartenza) {
        this.codiceVolo = codiceVolo;
        this.provenienza = provenienza;
        this.destinazione = destinazione;
        this.compagniaAerea = compagniaAerea;
        this.dataPartenza = dataPartenza;
        this.orarioPartenza = orarioPartenza;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public String getCodiceVolo() {
        return codiceVolo;
    }

    public void setCodiceVolo(String codiceVolo) {
        this.codiceVolo = codiceVolo;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String getCompagniaAerea() {
        return compagniaAerea;
    }

    public void setCompagniaAerea(String compagniaAerea) {
        this.compagniaAerea = compagniaAerea;
    }

    public LocalDate getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(LocalDate dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public LocalTime getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(LocalTime orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public StatoVolo getStato() {
        return stato;
    }

    public void setStato(StatoVolo stato) {
        this.stato = stato;
    }

    public String toString() {
        return "Codice Volo: " + codiceVolo + "\nDestinazione: " + destinazione + "\nProvenienza: " + provenienza
                + "Orario di partenza: " + orarioPartenza + "\nStato: " + stato;
    }

}

package model;

public class Passeggero {
    private String nome;
    private String cognome;
    private String documento;

    public Passeggero(String nome, String cognome, String documento) {
        this.nome = nome;
        this.cognome = cognome;
        this.documento = documento;
    }

    public Passeggero getPasseggero(){
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String toString() {
        return nome + " " + cognome;
    }
}

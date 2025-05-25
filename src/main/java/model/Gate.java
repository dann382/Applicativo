package model;

public class Gate {
    private boolean isLibero; //false = occupato , true = libero;
    private String codiceGate;


    public Gate(String codiceGate, boolean isLibero) {
        this.codiceGate = codiceGate;
        this.isLibero = isLibero;
    }

    public boolean isLibero() {
        return isLibero;
    }

    public void setLibero(boolean libero) {
        isLibero = libero;
    }

    public String getCodiceGate() {
        return codiceGate;
    }

    public void setCodiceGate(String codiceGate) {
        this.codiceGate = codiceGate;
    }


}

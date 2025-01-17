package Ereditarietà;

public class Cliente {
    private String codice;
    public Cliente (String codice) {
        this.codice = codice;
    }
    public String getCodice() {
        return codice;
    }
    public void stampaInformazioni() {
        System.out.println(", codice: " + getCodice());
    }
}

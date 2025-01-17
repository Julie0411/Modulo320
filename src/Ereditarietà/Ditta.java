package Ereditarietà;

public class Ditta extends Cliente {
    private String nome;
    public Ditta(String nome, String codice) {
        super(codice);
        this.nome = nome;
    }
    public void stampaInformazioni() {
        System.out.print("Azienda: " + this.nome);
        super.stampaInformazioni();
    }
}

package Ereditarietà;

public class Persona extends Cliente {
    private String nome;
    private String cognome;
    public Persona (String nome, String cognome, String codice) {
        super(codice);
        this.nome = nome;
        this.cognome = cognome;
    }
    public void stampaInformazioni() {
        System.out.print("Nome: " + this.nome + ", cognome: " + this.cognome);
        super.stampaInformazioni();
    }
}

package Serie6.Esercizio4;

public class Veicolo {
    private String nome;
    public Veicolo(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome + " ";
    }
    public String getNome() {
        return nome;
    }
}

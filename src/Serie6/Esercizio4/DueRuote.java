package Serie6.Esercizio4;

public class DueRuote extends Veicolo {
    private int peso;
    private int numPosti;
    public DueRuote(String nome, int peso, int numPosti) {
        super(nome);
        this.peso = peso;
        this.numPosti = numPosti;
    }
    @Override
    public String toString() {
        return getNome() + " " + this.peso + " " + this.numPosti;
    }
}

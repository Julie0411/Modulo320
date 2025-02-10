package Serie6.Esercizio4;

public class QuattroRuote extends Veicolo {
    private int lunghezza;
    public QuattroRuote(String nome, int lunghezza) {
        super(nome);
        this.lunghezza = lunghezza;
    }
    @Override
    public String toString() {
        return getNome() + " " +  lunghezza;
    }
}

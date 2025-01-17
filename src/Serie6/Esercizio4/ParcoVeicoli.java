package Serie6.Esercizio4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParcoVeicoli {
    private String luogo;
    private String nome;
    private int lunghezza;
    private int peso;
    private int numPosti;
    private int numeroRuote;
    Map<String, int[]> parcoVeicoli = new HashMap<>();

    public ParcoVeicoli(int numPosti, int peso, int lunghezza, String nome, String luogo) {
        this.numPosti = numPosti;
        this.peso = peso;
        this.lunghezza = lunghezza;
        this.nome = nome;
        this.luogo = luogo;
    }

    public void add4Ruoute() {
        int[] v4ruote = {lunghezza};
        this.parcoVeicoli.put(this.nome, v4ruote);
        this.numeroRuote += 4;
    }

    public void add2Ruoute() {
        int[] v2ruote = {this.peso, this.numPosti};
        this.parcoVeicoli.put(this.nome, v2ruote);
        this.numeroRuote += 2;
    }

    public String[] getContenuto() {
        int i = 0;
        String[] tuttiIVeicoli = new String[this.parcoVeicoli.size()];
        for(String n : this.parcoVeicoli.keySet()) {
            tuttiIVeicoli[i] = n + Arrays.toString(this.parcoVeicoli.get(n));
            i++;
        }
        return tuttiIVeicoli;
    }

    public void CancellaVeicolo(String nome) {
        this.parcoVeicoli.remove(nome);
    }

    public int getNumeroDiRuotePresenti() {
        return numeroRuote;
    }

}

/*
• ParcoVeicoli(String luogo): inserisce l’ubicazione del parco veicoli
• add4Ruote(String nome, int lunghezza): inserisce un veicolo a quattro ruote
• add2Ruote(String nome, int peso, int num_posti): inserisce un veicolo a due ruote
• String[] getContenuto(): ritorna tutti i veicoli inseriti (nome + i vari attributi)
• CancellaVeicolo(String nome): cancella il veicolo con il nome corrispondente
• int getNumeroDiRuotePresenti(): ritorna il numero di ruote presenti nel parco veicoli.
*/
package Serie6.Esercizio4;

import java.util.*;

public class ParcoVeicoli {
    private String luogo;
    private int numPosti;
    private int numeroRuote;
    private List<Veicolo> parcoVeicoli;

    public ParcoVeicoli(int numPosti, String luogo) {
        this.numPosti = numPosti;
        this.luogo = luogo;
        this.parcoVeicoli = new ArrayList<>();
    }

    public void add4Ruote(QuattroRuote quattroRuote) {
        this.parcoVeicoli.add(quattroRuote);
        this.numeroRuote += 4;
    }

    public void add2Ruote(DueRuote dueRuote) {
        this.parcoVeicoli.add(dueRuote);
        this.numeroRuote += 2;
    }

    public String getContenuto() {
        String s = "";
        for (Veicolo v : parcoVeicoli) {
            s += v.toString() + " ";
        }
        return s ;
    }

    public void CancellaVeicolo(String nome) {
        this.parcoVeicoli.remove(nome);
    }

    public int getNumeroDiRuotePresenti() {
        return numeroRuote;
    }

}
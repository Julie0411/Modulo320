package BancaI2a;

import java.util.ArrayList;
import java.util.List;

public class Banca {

    private String nome;
    private ArrayList<Conto> conti;
    private ArrayList<Conto> contiNegativi;

    public Banca(String nome) {
        this.nome = nome;
        this.conti = new ArrayList<>();
    }

    public void aggiungiConto(Conto conto) {
        this.conti.add(conto);
    }

    public void stampaConti(){
        for (Conto conto : this.conti) {
            System.out.println(conto);
        }
    }

    public Conto cercaConto(String codice) {
        for (Conto conto : this.conti) {
            if (conto.getCodice().contains(codice)) {
                return conto;
            }
        }
        return null;
    }

    public void cercaContoPerCliente(String dato) {
        List<Conto> conti = new ArrayList<>();
        for (Conto conto : this.conti) {
            if (conto.getCliente().getNome().equals(dato)) {
                conti.add(conto);
            } else if (conto.getCliente().getCognome().equals(dato)) {
                conti.add(conto);
            } else if (conto.getCliente().getVia().equals(dato)) {
                conti.add(conto);
            } else if (conto.getCliente().getCap().equals(dato)) {
                conti.add(conto);
            } else if (conto.getCliente().getCitta().equals(dato)) {
                conti.add(conto);
            } else if (conto.getCliente().getEmail().equals(dato)) {
                conti.add(conto);
            }
        }
        for (Conto c : conti) {
            System.out.println("Il conto " + c.getCodice() + " è di " + c.getCliente().getNome() + " " + c.getCliente().getCognome());
        }
    }

    public void stampaContiNegativi() {
        for (Conto conto : this.conti) {
            if (conto.getSaldo() < 0) {
                System.out.println("Questo conto ha un saldo negativo: " + conto);
            }
        }
    }

}

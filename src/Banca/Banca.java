package Banca;

import java.util.ArrayList;

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

    public Conto cercaContoPerCliente(String dato) {
        for (Conto conto : this.conti) {
            if (conto.getCliente().getNome().equals(dato)) {
                return conto;
            } else if (conto.getCliente().getCognome().equals(dato)) {
                return conto;
            } else if (conto.getCliente().getVia().equals(dato)) {
                return conto;
            } else if (conto.getCliente().getCap().equals(dato)) {
                return conto;
            } else if (conto.getCliente().getCitta().equals(dato)) {
                return conto;
            } else if (conto.getCliente().getEmail().equals(dato)) {
                return conto;
            }
        }
        return null;
    }

    public void stampaContiNegativi() {
        for (Conto conto : this.conti) {
            if (conto.getSaldo() < 0) {
                System.out.println("Questo conto ha un saldo negativo: " + conto);
            }
        }
    }

}

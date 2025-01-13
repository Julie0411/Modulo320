package RistoranteI2a;

public class Tavolo {

    private int numeroTavolo;
    private int numeroPosti;
    private boolean disponibile;

    public Tavolo(int numeroTavolo, int numeroPosti) {
        this.numeroTavolo = numeroTavolo;
        this.numeroPosti = numeroPosti;
        this.disponibile = true;
    }

    public void setTavolo() {
        this.disponibile = !(this.disponibile);
    }

    public int getNumeroPosti() {
        return this.numeroPosti;
    }

    public boolean eDisponibile() {
        return disponibile;
    }

    public String toString() {
        String disponibilita = "non disponibile";
        if (disponibile) {
            disponibilita = "disponibile";
        }
        return "Il numero del tavolo è " + this.numeroTavolo + ", ci sono " + this.numeroPosti + " posti ed è " + disponibilita + ".";
    }

}

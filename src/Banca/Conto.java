package Banca;

public class Conto {

    private float saldo;
    private String codice;
    private boolean statoVersamento;
    private boolean statoPrelievo;
    private Valuta valuta;
    private static int numConti = 0;
    private Cliente cliente;

    public Conto(String codice, float saldo, Valuta valuta, Cliente cliente) {
        this.codice = codice;
        this.saldo = saldo;
        try {
            this.valuta = valuta;
        } catch (Exception e) {
            this.valuta = Valuta.CHF;
        }
        this.cliente = cliente;
        numConti++;
    }

    public String getCodice() {
        return this.codice;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean versamento(float importo) {
        if (importo <= 0) {
            return statoVersamento = false;
        }
        this.saldo += importo;
        return statoVersamento = true;
    }

    public void ilVersamentoEAndatoABuonFine() {
        if (statoVersamento) {
            System.out.println("Versamento completato correttamente");
        } else {
            System.out.println("Il versamento è fallito: l'importo non era valido, inserisci un valore valido e riprova.");
        }
    }

    public boolean prelievo(float importo) {
        if ((this.saldo - importo) < -1000F) {
            return statoPrelievo = false;
        }
        this.saldo -= importo;
        return statoPrelievo = true;
    }

    public void ilPrelievoEAndatoABuonFine() {
        if (statoPrelievo) {
            System.out.println("Prelievo completato correttamente");
        } else {
            System.out.println("Il prelievo è fallito: l'importo non era valido, ti indebiteresti troppo, cambia importo e riprova.");
        }
    }

    public static int getNumConti() {
        return numConti;
    }

    public String toString() {
        return "Conto: " + this.codice + ", Saldo: " + this.saldo + " " + this.valuta + ", i conti totali sono: " + getNumConti() + " e appartiene a " + this.cliente.getNome() + " " + this.cliente.getCognome();
    }

}

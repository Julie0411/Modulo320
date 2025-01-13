package RistoranteI2a;

public class Prenotazione {

    private String nomePrenotazione;
    private int numeroPersone;
    private Tavolo tavoloAssegnato;
    private int orario;

    public Prenotazione(Cliente cliente, int numeroPersone, int orario) {
        this.nomePrenotazione = cliente.getNome();
        this.numeroPersone = numeroPersone;
        this.orario = orario;
    }

    public void setTavoloAssegnato(Tavolo tavoloAssegnato) {
        this.tavoloAssegnato = tavoloAssegnato;
    }

    public Tavolo getTavoloAssegnato() {
        return tavoloAssegnato;
    }

    public int getNumeroPersone() {
        return this.numeroPersone;
    }

    public String toString() {
        return "La prenotazione è a nome di " + nomePrenotazione + ", ha prenotato per " + numeroPersone
                + " persone, il tavolo assegnato è " + tavoloAssegnato.toString() + " ed è prenotato per le " + orario + ".";
    }

}

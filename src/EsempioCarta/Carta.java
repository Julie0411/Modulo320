package EsempioCarta;

public class Carta {

    private String seme;
    private String valore;

    //quando creo i getter e i setter l'operazione si chiama incapsulamento

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public String getSeme() {
        return seme;
    }

    public void setSeme(String seme) {
        this.seme = seme;

    }

    public String stringDellaCarta() {
        return "Carta: " + this.valore + " di " + this.seme;
    }

    @Override
    public String toString() {
        return "Carta: " + this.valore;
    }

}

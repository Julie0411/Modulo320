package EsempioCartaI2a;

public class Carta {

    private String seme;
    private String valore;

    //quando creo i getter e i setter l'operazione si chiama incapsulamento

    public Carta(String valore, String seme) {
        this.valore = valore;
        this.seme = seme;
    }

    public String getValore() {
        return valore;
    }

    public String getSeme() {
        return seme;
    }

    public String stringDellaCarta() {
        return "Carta: " + this.valore + " di " + this.seme;
    }

    public void confronto(Carta c) {
        boolean verifica = this.valore.equals(c.getValore()) && this.seme.equals(c.seme);
        if (verifica) {
            System.out.println("Sono uguali");
        } else {
            System.out.println("Non sono uguali");
        }
    }

}

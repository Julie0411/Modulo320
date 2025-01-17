package Serie6.Esercizio2;

public class testEsercizio2 {
    public static void main(String[] args) {
        Lavoratore lavoratore = new Lavoratore("Manuel", 8, 750);
        LavoratoreConStraordinariPagati lavoratoreConStraordinariPagati = new LavoratoreConStraordinariPagati("Francesca", 10, 950, 7);
        lavoratore.stampaStipendi();
        lavoratoreConStraordinariPagati.stampaStipendi();
    }
}

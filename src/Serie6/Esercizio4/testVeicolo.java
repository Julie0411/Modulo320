package Serie6.Esercizio4;

public class testVeicolo {
    public static void main(String[] args) {
        ParcoVeicoli parcoVeicoli = new ParcoVeicoli(50, "Lugano");
        DueRuote moto = new DueRuote("Moto", 5, 2);
        QuattroRuote auto = new QuattroRuote("Auto", 120);
        parcoVeicoli.add2Ruote(moto);
        parcoVeicoli.add4Ruote(auto);
        System.out.println(parcoVeicoli.getContenuto());
        System.out.println("Le ruote del garage sono: " + parcoVeicoli.getNumeroDiRuotePresenti());
    }
}

package Banca;

public class Main {

    /*
     * - impostare la valuta (CHF, EURO, $)
     * - metodo che ritorna la stampa di tutti i conti con un saldo negativo
     * - metodo per la ricerca di un conto deve funzionare anche solo con un dato parziale
     * - creare la classe Cliente (nome, cognome, via, cap, citta, email)
     * - legare un conto ad un cliente
     * - ricercare tutti i conti di un cliente (ricerca su qualsiasi campo)
     */

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mario", "Rossi", "Via Roma 1", "6900", "Massagno", "mario.rossi@gmail.com");
        Cliente cliente2 = new Cliente("Luigi", "Verdi", "Via alle Fornaci 1", "6930", "Bedano", "luigi.verdi@icloud.com");
        Cliente cliente3 = new Cliente("Giulia", "Di Venti", "Via Zurigo 3", "6500", "Bellinzona", "giulia.diVenti@outlook.com");

        Banca banca = new Banca("Cornér Banca");
        banca.aggiungiConto(new Conto("ABC123", 123.45F, Valuta.CHF, cliente1));
        banca.aggiungiConto(new Conto("ABC124", 124.45F, Valuta.EUR, cliente2));
        banca.aggiungiConto(new Conto("ABC125", -125.45F, Valuta.USD, cliente3));
        banca.stampaConti();

        Conto conto = banca.cercaConto("ABC125");
        conto.versamento(555.45F);
        conto.ilVersamentoEAndatoABuonFine();
        System.out.println(banca.cercaConto("ABC125"));

        Conto conto1 = banca.cercaConto("124");
        conto1.prelievo(100.45F);
        conto1.ilPrelievoEAndatoABuonFine();
        System.out.println(banca.cercaConto("24"));
        conto1.prelievo(50.45F);

        banca.stampaContiNegativi();

        System.out.println(banca.cercaContoPerCliente("Mario"));
        System.out.println(banca.cercaContoPerCliente("6930"));
        System.out.println(banca.cercaContoPerCliente("Di Venti"));

    }

}

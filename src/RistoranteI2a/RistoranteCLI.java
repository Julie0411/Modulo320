package RistoranteI2a;

import java.util.Scanner;

public class RistoranteCLI {

    public static void main(String[] args) {

        Ristorante ristorante = new Ristorante();
        Scanner sc = new Scanner(System.in);
        Prenotazione prenotazione = null;

        for (;;) {
            System.out.println("=== Sistema di Prenotazione per Ristorante ===");
            System.out.println("1. Aggiungere un nuovo tavolo");
            System.out.println("2. Effettuare una nuova prenotazione");
            System.out.println("3. Annullare una prenotazione");
            System.out.println("4. Mostrare tutti i tavoli disponibili");
            System.out.println("5. Mostrare tutte le prenotazioni attive");
            System.out.println("6. Esci");
            System.out.println("Seleziona un opzione:");

            int input = sc.nextInt();

            if (input == 1) {
                System.out.println("Inserisci un numero per il tavolo: ");
                int numeroTavolo = sc.nextInt();
                System.out.println("Inserisci un numero di posti per il tavolo: ");
                int numeroPosti = sc.nextInt();
                Tavolo tavolo = new Tavolo(numeroTavolo, numeroPosti);
                ristorante.aggiungiTavolo(tavolo);
            } else if (input == 2) {
                sc.nextLine();
                System.out.println("Qual'è il tuo nome: ");
                String nome = sc.nextLine();
                System.out.println("Qual'è il tuo cognome: ");
                String cognome = sc.nextLine();
                System.out.println("Qual'è la tua email: ");
                String email = sc.nextLine();
                Cliente cliente = new Cliente(nome, cognome, email);
                System.out.println("Quante persone siete: ");
                int numeroPersone = sc.nextInt();
                System.out.println("Per che ora volete la prenotazione: ");
                int orario = sc.nextInt();
                prenotazione = new Prenotazione(cliente, numeroPersone, orario);
                ristorante.aggiungiPrenotazione(prenotazione);
            } else if (input == 3) {
                ristorante.annullaPrenotazione(input);
            } else if (input == 4) {
                ristorante.mostraTavoliDisponibili();
            } else if (input == 5) {
                ristorante.mostraPrenotazioni();
            } else if (input == 6) {
                break;
            } else {
                System.out.println("Input invalido, inserisci un altro numero e riprova...");
            }
        }

    }

}

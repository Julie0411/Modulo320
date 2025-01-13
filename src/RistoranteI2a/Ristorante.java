package RistoranteI2a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ristorante {

    private ArrayList<Tavolo> tavoli = new ArrayList<>();
    private Map<Integer, Prenotazione> prenotazioni = new HashMap<>();

    public void aggiungiTavolo(Tavolo tavolo) {
        this.tavoli.add(tavolo);
    }

    public void aggiungiPrenotazione(Prenotazione prenotazione) {
        if (tavoli.isEmpty()) throw new IllegalArgumentException("ATTENZIONE NON HAI REGISTRATO NESSUN TAVOLO, REGISTRANE UNO E RIPROVA!");
        int i = 0;
        for (Tavolo tavolo : tavoli) {
            if (tavolo.eDisponibile()) {
                if (tavolo.getNumeroPosti() == prenotazione.getNumeroPersone()) {
                    prenotazione.setTavoloAssegnato(tavolo);
                    tavolo.setTavolo();
                    i++;
                    this.prenotazioni.put(i, prenotazione);
                    System.out.println("Il tuo numero di prenotazione è: " + i
                            + ", ricordalo perché ti servire qualora vorrai annullare la prenotazione");
                } else {
                    System.out.println("Non abbiamo disponibilità per te");
                }
            }
        }
    }

    public void annullaPrenotazione(int indice) {
        try {
            prenotazioni.get(indice).getTavoloAssegnato().setTavolo();
            prenotazioni.remove(indice);
        } catch (Exception e) {
            System.out.println("Non hai prenotazioni attive, creane una!");
        }
    }

    public void mostraTavoliDisponibili() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Tavolo tavolo : tavoli) {
            stringBuilder.append(tavolo);
        }
        System.out.println(stringBuilder);
    }

    public void mostraPrenotazioni() {
        String listaPrenotazioni = "";
        for (int i = 0; i < prenotazioni.size(); i++) {
            listaPrenotazioni += prenotazioni.get(i).toString();
        }
        System.out.println(listaPrenotazioni);
    }

}

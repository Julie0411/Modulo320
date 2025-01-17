package Ereditarietà;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clienti = new ArrayList<>();
        clienti.add(new Persona("Marco", "Berasconi", "ABC123"));
        clienti.add(new Ditta("CPT Locarno", "ABC124"));
        clienti.add(new Persona("Marta", "Bianchi", "ABC125"));
        for (Cliente c : clienti) {
            c.stampaInformazioni();
        }
    }
}

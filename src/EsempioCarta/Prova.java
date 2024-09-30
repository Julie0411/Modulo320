package EsempioCarta;

import java.util.Arrays;

public class Prova {

    public static void main(String[] args) {

        Carta carta = new Carta();
        carta.setSeme("Fiori");
        carta.setValore("8");

        Carta carta2 = new Carta();
        carta2.setSeme("Picche");
        carta2.setValore("2");

        Carta[] mazzo = new Carta[52];
        String[] semi = {"Cuori", "Quadri", "Fiori", "Picche"};
        String[] valori = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;

        for (String seme : semi) {
            for (String valore : valori) {
                Carta cartaMazzo = new Carta();
                cartaMazzo.setSeme(seme);
                cartaMazzo.setValore(valore);
                mazzo[index] = cartaMazzo;
                index++;
            }
        }

        MischiaCarte michiaCarte = new MischiaCarte();
        mazzo = michiaCarte.mischia(mazzo);

        System.out.println(carta.stringDellaCarta());
        System.out.println(carta2.stringDellaCarta());

        System.out.println("--------- Cambio esempio ---------");

        for (Carta c : mazzo) {
            System.out.println(c.stringDellaCarta());
        }

    }
}
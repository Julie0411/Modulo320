package EsempioCarta;

public class Prova {

    public static void main(String[] args) {

        Carta carta = new Carta();
        carta.setSeme("Fiori");
        carta.setValore("8");

        Carta carta2 = new Carta();
        carta2.setSeme("Picche");
        carta2.setValore("2");

        Carta[] mazzo = new Carta[52];
        String[] semi = {"Cuori", "Quadri", "Semi", "Picche"};
        String[] valori = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int seme = 0;

        for (int i = 0; i < mazzo.length; i++) {
            for (int j = 0; j < mazzo.length / 13; j++) {
                Carta cartaMazzo = new Carta();
                cartaMazzo.setSeme(semi[seme]);
                cartaMazzo.setValore(valori[j]);
                mazzo[i] = cartaMazzo;
            }
        }

        System.out.println(carta.stringDellaCarta());
        System.out.println(carta2.stringDellaCarta());

    }

}

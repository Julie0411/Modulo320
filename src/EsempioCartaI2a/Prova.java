package EsempioCartaI2a;

public class Prova {

    public static void main(String[] args) {

        //Istanza = rappresentazione della classe
        Carta carta = new Carta("Fiori", "8");
        Carta carta2 = new Carta("Fiori" , "8");
        Carta carta3 = new Carta("Quadri" , "A");

        Carta[] mazzo = new Carta[52];
        String[] semi = {"Cuori", "Quadri", "Fiori", "Picche"};
        String[] valori = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;

        for (String seme : semi) {
            for (String valore : valori) {
                mazzo[index] = new Carta(seme, valore);
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

        System.out.println("--------------");

        carta.confronto(carta2);
        carta.confronto(carta3);

    }

}
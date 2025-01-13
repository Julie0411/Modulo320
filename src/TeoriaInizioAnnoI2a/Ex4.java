package TeoriaInizioAnnoI2a;

import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args) {

        int[][] matrice = new int[3][3];
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            randomNumbers.add(i);
        }

        for (int i = 0; i < matrice.length; i++) {

            for (int j = 0; j < matrice[0].length; j++) {
                int randomNumber = (int) (Math.random() * randomNumbers.size());
                matrice[i][j] = randomNumbers.get(randomNumber);
                randomNumbers.remove(randomNumber);
            }


        }

        for (int i = 0; i < matrice.length; i++) {

            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }

            System.out.println();

        }

    }

}
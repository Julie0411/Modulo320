package TeoriaInizioAnnoI2a;

import java.util.Scanner;

public class Ex2Refactored {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lowerRange = 1;
        int maxRange = 100;
        int counter = 0;

        for (;;) {
            int computerGuess = (lowerRange + maxRange) / 2;
            System.out.println("The computer guess: " + computerGuess + ". Is it right?");
            String answer = sc.nextLine();

            if (answer.equals("yes")) {
                System.out.println("The computer guessed it right! It took " + (counter + 1) + " tries.");
                break;
            } else {
                counter++;
                System.out.println("Is the number greater or lower?");
                String value = sc.nextLine();

                if (value.equals("greater")) {
                    lowerRange = computerGuess;
                } else if (value.equals("lower")) {
                    maxRange = computerGuess;
                }
            }
        }
    }
}
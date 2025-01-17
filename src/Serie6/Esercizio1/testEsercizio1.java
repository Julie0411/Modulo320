package Serie6.Esercizio1;

import java.util.ArrayList;
import java.util.List;

public class testEsercizio1 {
    public static void main(String[] args) {
        List<Libro> libri = new ArrayList<>();
        libri.add(new Libro("Orgoglio e pregiudizio", 650));
        libri.add(new Vocabolario("Zannichelli", 463, 70000));
        for (Libro l : libri) {
            l.pageMessage();
        }
    }
}

/*
* Scrivere infine un programma di prova per collaudare le classi e i metodi.
*/
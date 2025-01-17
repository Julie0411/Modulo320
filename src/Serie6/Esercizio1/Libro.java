package Serie6.Esercizio1;

public class Libro {
    private String name;
    private int numPagine;
    public Libro(String name, int numPagine) {
        this.name = name;
        this.numPagine = numPagine;
    }
    public void pageMessage() {
        System.out.println("The book " + this.name + " has " + this.numPagine + " pages");
    }
    public int getNumPagine() {
        return numPagine;
    }
    public String getName() {
        return name;
    }
}

/*
Scrivi una classe Libro le cui istanze rappresentano libri. Ogni libro è caratterizzato dal
numero di pagine. La classe deve contenere una variabile di istanza intera, numPagine,
un costruttore che assegna al libro un numero specificato di pagine, ed un metodo
pageMessage() che stampa il numero di pagine del libro.
*/
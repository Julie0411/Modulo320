package Serie6.Esercizio1;

public class Vocabolario extends Libro {
    private int numDefinizioni;
    public Vocabolario(String name, int numPagine, int numDefinizioni) {
        super(name, numPagine);
        this.numDefinizioni = numDefinizioni;
    }
    public void pageMessage() {
        System.out.println("This dictionary " + getName() + " has " + getNumPagine() + " and " + this.numDefinizioni + " definitions");
    }
}

/*
* Scrivere quindi una classe Vocabolario che estende la classe Libro. La classe deve
contenere una nuova variabile di istanza, numDefinizioni, un costruttore che assegna al
vocabolario un numero di pagine e un numero di definizioni specificati, ed un metodo
definitionMessage() che stampa un messaggio contenente il numero di pagine, il numero
di definizioni ed il numero medio di definizioni per pagina del vocabolario.
* */
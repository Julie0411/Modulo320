package Serie6.Esercizio2;

public class Lavoratore {

    private String nome;
    private int livello;
    private int stipendio;

    public Lavoratore(String nome, int livello, int stipendio) {
        this.nome = nome;
        this.livello = livello;
        this.stipendio = stipendio;
    }

    public void stampaStipendi() {
        System.out.println(this.nome + " riceve " + this.stipendio + " chf al mese.");
    }

    public String getNome() {
        return nome;
    }

    public int getStipendio() {
        return stipendio;
    }

}

/*
Esercizio 2
Si scriva una classe Lavoratore le cui istanze rappresentano lavoratori. Ogni lavoratore è
caratterizzato da un nome, un livello ed uno stipendio (mensile). La classe deve contenere
una variabile di istanza di tipo stringa nome e due variabili di istanza intere, livello e
stipendio, un costruttore che assegna al lavoratore un numero ed un livello specificati, ed
un metodo stampaStipendio() che stampa lo stipendio del lavoratore.

Scrivere infine un programma di prova per collaudare le classi e i metodi.
*/
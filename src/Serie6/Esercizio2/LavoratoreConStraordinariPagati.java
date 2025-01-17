package Serie6.Esercizio2;

public class LavoratoreConStraordinariPagati extends Lavoratore {

    private int oreStraordinario;
    private static double retribuzioneOraria = 10.0;

    public LavoratoreConStraordinariPagati(String nome, int livello, int stipendio, int oreStraordinario) {
        super(nome, livello, stipendio);
        this.oreStraordinario = oreStraordinario;
    }

    @Override
    public void stampaStipendi() {
        System.out.println(super.getNome() + " riceve " + (super.getStipendio() + this.oreStraordinario * this.retribuzioneOraria) + " chf al mese.");
    }

}

/*
Scrivere quindi una classe LavoratoreConStraordinariPagati che estende la classe
Lavoratore.

La classe deve contenere una nuova variabile di istanza, oreStraordinario, un
costruttore che assegna al lavoratore con straordinari pagati un nome, un livello e un
numero di ore di straordinario specificati, un metodo stampaStraordinari() che stampa un
messaggio contenente il numero di ore di straordinario.

La classe deve inoltre contenere
una variabile statica reale retribuzioneOraria, inizializzata a 10.0, corrispondente alla
retribuzione di un'ora di straordinario (che si suppone uguale per tutti). La classe deve
inoltre ridefinire il metodo stampaStipendio() per tenere conto della retribuzione delle ore
di straordinario: alla retribuzione base (ereditata da Lavoratore) va sommata la
retribuzione degli straordinari, ottenuta come retribuzione oraria dello straordinario per
numero di ore di straordinario effettuate.
*/
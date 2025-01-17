package Serie6.Esercizio3;

//Quadrato è la classe figlia di Rettangolo, eredita da trapezo, quadrilatero, Parallelogramma e Rettangolo
public class Quadrato extends Rettangolo {
    public Quadrato(double x1, double y1, double lato) {
        super(x1,y1,lato, lato);
    }
}

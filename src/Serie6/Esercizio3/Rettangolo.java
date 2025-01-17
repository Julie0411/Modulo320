package Serie6.Esercizio3;

//Rettangolo è la classe figlia di Parallelogramma, eredita da trapezo, quadrilatero e Parallelogramma
public class Rettangolo extends Parallelogramma {
    public Rettangolo(double x1, double y1, double lato1, double lato2) {
        super(x1, y1, x1, y1 + lato1, lato2);
    }
}

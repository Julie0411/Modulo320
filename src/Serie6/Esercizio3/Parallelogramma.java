package Serie6.Esercizio3;

//Parallelogramma è la classe figlia di Trapezio, eredita si a da trapezo che da quadrilatero
public class Parallelogramma extends Trapezio {
    public Parallelogramma(double x1, double y1, double x2, double y2, double lato) {
        super(x1, y1, x2, y2, lato, lato);
    }
}

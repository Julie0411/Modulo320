package Serie6.Esercizio3;

//Trapezio, prima classe figlia, eredita da Quadrilatero e inizia a dare più dettagli su come è fatto un quadrilatero
public class Trapezio extends Quadrilatero {

    public Trapezio(double x1, double y1, double x2, double y2, double baseMaggiore, double baseMinore) {
        super(x1, y1, x2, y2, x1 + baseMinore, y1, x2 + baseMaggiore, y2);
    }

}

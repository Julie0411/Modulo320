package Serie6.Esercizio3;

//superclasse, la classe che definisce genericamente come saranno le classi figlie
public class Quadrilatero {

    private double x1, y1, x2, y2, x3, y3, x4, y4;

    public Quadrilatero() {
        x1 = y1 = x2 = y2 = x3 = y3 = x4 = y4 = 0;
    }

    public Quadrilatero(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public String toString() {
        return getClass().getName() + " di vertici " + "(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + "), (" + x4 + "," + y4 + ").";
    }

}

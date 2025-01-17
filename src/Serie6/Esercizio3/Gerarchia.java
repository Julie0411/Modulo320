package Serie6.Esercizio3;

public class Gerarchia {
    public static void main(String[] args) {
        Quadrilatero q;
        q = new Quadrilatero(0,0,2,2,9,2,12,1);
        System.out.println(q.toString());
        q = new Trapezio(0,0,2,2,9,12);
        System.out.println(q.toString());
        q = new Parallelogramma(0,0,2,2,9);
        System.out.println(q.toString());
        q = new Rettangolo(0,0,2,4);
        System.out.println(q.toString());
        q = new Quadrato(0,0,2);
        System.out.println(q.toString());
    }
}

/*
Output:
Serie6.Esercizio3.Quadrilatero di vertici (0.0,0.0), (2.0,2.0), (9.0,2.0), (12.0,1.0).
Serie6.Esercizio3.Trapezio di vertici (0.0,0.0), (2.0,2.0), (12.0,0.0), (11.0,2.0).
Serie6.Esercizio3.Parallelogramma di vertici (0.0,0.0), (2.0,2.0), (9.0,0.0), (11.0,2.0).
Serie6.Esercizio3.Rettangolo di vertici (0.0,0.0), (0.0,2.0), (4.0,0.0), (4.0,2.0).
Serie6.Esercizio3.Quadrato di vertici (0.0,0.0), (0.0,2.0), (2.0,0.0), (2.0,2.0).
*/
package geometry.polygons.base;

public class Prova {

    public static void main(String[] args) {
        Triangle triangolo = new Triangle(5, 6, 7);
        System.out.println("Triangolo");
        System.out.println("Area: " + triangolo.area());
        System.out.println("Perimetro: " + triangolo.perimeter());

        Rectangle rettangolo = new Rectangle(10, 15);
        System.out.println("Rettangolo");
        System.out.println("Area: " + rettangolo.area());
        System.out.println("Perimetro: " + rettangolo.perimeter());
        System.out.println("Diagonale: " + rettangolo.diagonal());

        Square quadrato = new Square(10);
        System.out.println("Quadrato");
        System.out.println("Area: " + quadrato.area());
        System.out.println("Perimetro: " + quadrato.perimeter());
        System.out.println("Diagonale: " + quadrato.diagonal());
    }
}

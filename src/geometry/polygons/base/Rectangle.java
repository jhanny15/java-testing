package geometry.polygons.base;

public class Rectangle extends Polygon{

    /**
     * Costruttore del Rettangolo
     */
    public Rectangle() {
        super(4);
    }

    /**
     * Metodo per inserire i valori dei lati
     * @param a base
     * @param b altezza
     */
    public void setValues(double a, double b) {
        for(int i = 0; i < (sides.length-2); i++) {
            sides[i] = a;
            sides[++i] = b;
        }
    }

    /**
     * Metodo per calcolare l'area
     * @return area
     */
    @Override
    public double area() {
        return (sides[0] * sides[1]);
    }

    /**
     * Metodo per calcolare il perimetro
     * @return perimetro
     */
    @Override
    public double perimeter() {
        return (2 * (sides[0] + sides[1]));
    }

    /**
     * Metodo per calcolare il diagonale
     * @return diagonale
     */
    public double diagonal() {
        return (Math.sqrt(sides[0] * sides[2] + sides[1] * sides[3]));
    }
}

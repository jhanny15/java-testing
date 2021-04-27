package geometry.polygons.base;

public class Rectangle extends Polygon{

    private double sideA = 1.0;
    private double sideB = 1.0;

    /**
     * Costruttore del Rettangolo con i lati prefissati
     */
    public Rectangle() {
    }

    /**
     * Costruttore del Rettangolo con i lati specificati
     * @param sideA base
     * @param sideB altezza
     */
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * Metodo per calcolare l'area
     * @return area
     */
    @Override
    public double area() {
        return (sideA * sideB);
    }

    /**
     * Metodo per calcolare il perimetro
     * @return perimetro
     */
    @Override
    public double perimeter() {
        return (2 * (sideA + sideB));
    }

    /**
     * Metodo per calcolare il diagonale
     * @return diagonale
     */
    public double diagonal() {
        return (Math.sqrt(sideA * sideA + sideB * sideB));
    }
}

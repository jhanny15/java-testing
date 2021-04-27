package geometry.polygons.base;

public class Triangle extends Polygon {

    private double sideA = 1.0;
    private double sideB = 1.0;
    private double sideC = 1.0;

    /**
     * Costruttore del Triangolo con i lati prefissati
     */
    public Triangle() {
    }

    /**
     * Costruttore del Triangolo con i lati specificati
     * @param sideA
     * @param sideB
     * @param sideC
     */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Metodo per trovare l'area
     * @return l'area se è un triangolo valido
     */
    @Override
    public double area() {
        if(isTriangle()) return (sideA + sideB + sideC) / 2;
        else return 0;
    }

    /**
     * Metodo per calcolare il perimetro
     * @return il perimetro se è un triangolo valido
     */
    @Override
    public double perimeter() {
        if(isTriangle()) return (sideA+sideB+sideC);
        else return 0;
    }

    public boolean isTriangle() {
        return ((sideA + sideB > sideC)&&(sideA + sideC > sideB)&&(sideB + sideC > sideA));
    }
}

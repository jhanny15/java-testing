package geometry.polygons.base;

public class Polygon {
    private int numSides = 3;
    private double[] sides;

    /**
     * Costruttore di Poligono che crea di base un triangolo
     */
    public Polygon() {
        this.sides = new double[numSides];
    }

    /**
     * Costruttore di Poligono con il numero di lati specificati
     * @param numSides numero di lati
     */
    public Polygon(int numSides) {
        this.numSides = numSides;
        this.sides = new double[numSides];
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

}

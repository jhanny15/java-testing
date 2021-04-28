package geometry.polygons.base;

public class Polygon {
    private int numSides = 3;
    protected double[] sides;

    /**
     * Costruttore di Poligono che crea di default un triangolo
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

    /**
     * Metodo per inserire i valori dei lati
     * @param a latoA
     * @param b latoB
     * @param c latoC
     */
    public void setValues(double a, double b, double c) {
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
    }

    /**
     * Calcola l'area del Poligono
     * @return area
     */
    public double area(){
        double area = 0.0;

        for(int i = 0; i < sides.length; i++) {
          area += sides[i];
        }
        return (area/2);
    }

    /**
     * Calcola il perimetro del Poligono
     * @return perimetro
     */
    public double perimeter(){
         double perimeter = 0.0;

         for(int i = 0; i < sides.length; i++) {
             perimeter += sides[i];
         }
         return perimeter;
    }

}

package geometry.polygons.base;

public class Triangle extends Polygon {

    /**
     * Costruttore del Triangolo
     */
    public Triangle() {
    }

    /**
     * Metodo per trovare l'area
     * @return l'area se è un triangolo valido
     */
    @Override
    public double area() {
        if(isTriangle()) {
            double area = 0.0;

            for (double side : sides) {
                area += side;
            }
            return (area/2);
        }
        else return 0;
    }

    /**
     * Metodo per calcolare il perimetro
     * @return il perimetro se è un triangolo valido
     */
    @Override
    public double perimeter() {
        if(isTriangle()){
            double perimeter = 0.0;

            for (double side : sides) {
                perimeter += side;
            }
            return perimeter;
        }
        else return 0;

    }

    /**
     * Metodo che verifica se il triangolo è valido
     * @return true se è valido
     */
    public boolean isTriangle() {
        return ((sides[0] + sides[1] > sides[2])&&
                (sides[0] + sides[2] > sides[1])&&
                (sides[1] + sides[2] > sides[0]));
    }
}

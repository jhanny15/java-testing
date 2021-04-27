package geometry.polygons.base;

public class Square extends Rectangle{

    /**
     * Costruttore con i lati prefissati dalla classe Rectangle
     */
    public Square() {
    }

    /**
     * Costruttore con i lati specificati
     * @param sideA lato a e b
     */
    public Square(double sideA) {
        super(sideA, sideA);
    }

}

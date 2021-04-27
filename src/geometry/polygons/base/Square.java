package geometry.polygons.base;

public class Square extends Rectangle{

    /**
     * Costruttore con i lati specificati
     */
    public Square() {
    }

    /**
     * Metodo per inserire i valori dei lati
     * @param a lato
     */
    public void setValues(double a) {
        for(int i = 0; i < sides.length; i++) {
            sides[i] = a;
        }
    }

}

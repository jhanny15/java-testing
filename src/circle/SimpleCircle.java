package circle;

public class SimpleCircle {

    //Raggio del cerchio
    private double raggio;


    //Costruttore della classe SimpleCircle
    public SimpleCircle(double raggio){
        this.raggio = raggio;
    }


    /**
     * Calcola l'area del cerchio
     * @return l'area del cerchio
     */
    public double getArea() {
        return (Math.pow(raggio, 2)*Math.PI);
    }


    /**
     * Calcola il perimetro del cerchio
     * @return il perimetro del cerchio
     */
    public double getPerimetro(){
        return (2*raggio*Math.PI);
    }


    public void setRaggio(double raggio){
        this.raggio = raggio;
    }


    public double getRaggio(){
        return this.raggio;
    }

}

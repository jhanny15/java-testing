package javatesting;

public class NumMultiplo extends NumPariDispari{

    public void controllaMultiplo() {

        if(this.i%2==0)  System.out.println(" è un multiplo di 2");
            else if (this.i%3==0)   System.out.println(" è un multiplo di 3");
            else if (this.i%5==0)   System.out.println(" è un multiplo di 5");
            else if (this.i%7==0)   System.out.println(" è un multiplo di 7");
            else System.out.println(" non appartiene a nessun multiplo");
    }

    public static void main(String[] args) {
        NumMultiplo num = new NumMultiplo();

        System.out.println("Inserisci N:");
        num.setN(77);                       //Input di N

        System.out.println(num.getN());     //Stampa il valore di N

        for (num.i=1; num.i < num.n+1; num.i++) {
            System.out.print(num.i + " ");
            num.controllaMultiplo();
        }
    }
}

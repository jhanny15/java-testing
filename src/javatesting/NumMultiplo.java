package javatesting;

import java.util.Scanner;

public class NumMultiplo extends NumPariDispari{

    public void controllaMultiplo() {

        if(this.i%2==0)  System.out.println(" è un multiplo di 2");
            else if (this.i%3==0)   System.out.println(" è un multiplo di 3");
            else if (this.i%5==0)   System.out.println(" è un multiplo di 5");
            else if (this.i%7==0)   System.out.println(" è un multiplo di 7");
            else System.out.println(" non appartiene a nessun multiplo");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumMultiplo num = new NumMultiplo();

        System.out.println("Inserisci N:");
        num.n = input.nextInt();        //Input del valore di N
        System.out.println(num.n);      //Stampa il valore di N

        for (num.i=1; num.i < num.n+1; num.i++) {
            System.out.print(num.i + " ");
            num.controllaMultiplo();
        }
    }
}

package javatesting;

import java.util.Scanner;

public class NumPariDispari {

    protected int n;
    protected int i = 0;


    //Controlla se I è pari o dispari
    public void controllaN() {
        if ((i%2==0)||(i==1)) {
            System.out.println("pari");
        } else System.out.println("dispari");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumPariDispari num = new NumPariDispari();  //Creazione dell'istanza NumPariDispari

        System.out.println("Inserisci N:");
        num.n = input.nextInt();        //Input del valore di N
        System.out.println(num.n);      //Stampa il valore di N

        System.out.println("Risultato:");

        //Stampa il valore di I e usa "controllaN" per vedere se è pari o dispari
        for (num.i=1; num.i < num.n+1; num.i++) {
            System.out.print(num.i + " ");
            num.controllaN();
        }

    }
}

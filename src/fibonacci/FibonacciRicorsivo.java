package fibonacci;

import java.util.Scanner;

public class FibonacciRicorsivo {

    /**
     * Calcola la successione di Fibonacci (Ricorsivo)
     * @param n: Numero da calcolare
     * @return : Numero di Fibonacci
     */
    public int calcolaFibRic(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        return (calcolaFibRic(n-1)+calcolaFibRic(n-2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciRicorsivo ogg = new FibonacciRicorsivo();
        System.out.println("Inserisci n:");
        int num = input.nextInt();

        System.out.println(ogg.calcolaFibRic(num));
    }
}

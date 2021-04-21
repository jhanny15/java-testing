package fibonacci;

import java.util.Scanner;

public class FibonacciIterativo {


    /**
     * Calcola la successione di Fibonacci
     * a e b sono i primi 2 numeri della successione
     * c è la somma di a e b
     * @param n: Numero da trovare
     * @return c: Ritorna la somma di a e b
     */
    int calcolaFib(int n){

        if(n==0) return 0;
        if(n==1) return 1;

        int a = 0;
        int b = 1;
        int c = a + b;

        for(int i=1; i<n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciIterativo ogg = new FibonacciIterativo();

        System.out.println("Inserisci n:");
        int num = input.nextInt();

        System.out.println(ogg.calcolaFib(num));
    }
}

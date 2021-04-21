package numIntero;

public class Intero {

    //Il numero intero
    private int num;

    //Costruttore della Classe
    public Intero(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Metodo per calcolare il numero di Fibonacci
     * a e b sono i primi 2 numeri della successione
     * somma è la somma di a e b
     * @return 0 se num è uguale a 0,
     * 1 se num è uguale a 1,
     * somma per il numero di Fibonacci
     */
    public int getFibonacci() {
        if(num==0) return 0;
        if(num==1) return 1;

        int a = 0;
        int b = 1;
        int somma = a + b;

        for(int i=1; i<num; i++){
            somma = a + b;
            a = b;
            b = somma;
        }
        return somma;
    }

    /**
     * Metodo per trovare il fattoriale di un numero intero (Iterativo)
     * int m: Prende il valore di num
     * @return m: Ritorna il fattoriale di num
     */
    public int getFattoriale(){
        int m = num;
        if(num==0) {
            return 1;
        }
        else {
            for(int i=1; i < num; i++) {
                m = m*i;
            }
            return m;
        }
    }

    /**
     * Metodo per controllare se num è pari o dispari
     * @return un boolean (true = pari, false = dispari)
     */
    public boolean getPariDispari() {
        return (num%2==0);
    }

    public int getMultiplo() {
        int multiplo;
        if(num%2==0) {
            multiplo = 2;
        }
        else if(num%3==0) {
            multiplo = 3;
        }
        else if(num%5==0) {
        multiplo = 3;
        }
        else if(num%7==0) {
            multiplo = 3;
        }
        else multiplo = 0;

        return multiplo;
    }

}

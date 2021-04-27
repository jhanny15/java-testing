package numIntero;

public class Intero {

    //Il numero intero
    private int n;

    //Costruttore privato
    private Intero(){};

    //Costruttore della Classe
    public Intero(int num){
        this.n = num;
    }

    public int getNum() {
        return n;
    }

    public void setNum(int n) {
        this.n = n;
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
        if(n==0) return 0;
        if(n==1) return 1;

        int a = 0;
        int b = 1;
        int somma = a + b;

        for(int i=1; i<n; i++){
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
        int m = n;
        if(n==0) {
            return 1;
        }
        else {
            for(int i=1; i < n; i++) {
                m = m*i;
            }
            return m;
        }
    }

    /**
     * Metodo per controllare se num è pari o dispari
     * @return un boolean (true = pari, false = dispari)
     */
    public boolean isPari() {
        return (n % 2 == 0);
    }

    /**
     *
     * @param m Numero
     * @return un boolean
     */
    public boolean isMultiplo(int m) {
        if(m>n) return false;
        return ( n % m == 0 );
    }

    public static void main(String[] args) {

        Intero num = new Intero (10);
        System.out.println("Il numero è: " + num.getNum() );
        System.out.println("Il numero di Fibonacci alla " + num.getNum() + "a posizione è: " + num.getFibonacci());
        System.out.println("Il numero fattoriale è: " + num.getFattoriale());

        if(num.isPari()){
            System.out.println("Il numero è pari");
        } else System.out.println("Il numero è dispari");



    }
}

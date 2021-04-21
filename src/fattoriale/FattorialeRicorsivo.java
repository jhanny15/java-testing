package fattoriale;

public class FattorialeRicorsivo {

    /**
     * Metodo per trovare il fattoriale di un numero intero (Ricorsivo)
     * @param n: Numero da inserire
     * @return n: Ritorna il fattoriale di n
     */
    public int fatRic(int n) {
        if(n==0) {
            return 1;
        }
        else {
            n = n*fatRic(n-1);
            return n;
        }
    }

    public static void main(String[] args) {
        FattorialeRicorsivo man = new FattorialeRicorsivo();

        System.out.println(man.fatRic(5));
    }
}

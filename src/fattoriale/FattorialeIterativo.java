package fattoriale;

public class FattorialeIterativo {

    /**
     * Metodo per trovare il fattoriale di un numero intero (Iterativo)
     * @param n: Numero da inserire
     * int m: Numero costante di n
     * @return n: Ritorna il fattoriale di n
     */
    public int fatIte(int n) {
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

    public static void main(String[] args) {
        FattorialeIterativo man = new FattorialeIterativo();

        System.out.println(man.fatIte(5));
    }
}

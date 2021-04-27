package dataStructure.stackArrayString;

public class Stack {

    private int head = 0;
    private int size = 0;
    private int[] arr;
    private static final int MAX_LENGTH = 32;


    /**
     * Costruttore pubblico con la lunghezza = 32;
     */
    public Stack() {
        arr = new int[MAX_LENGTH];
    }

    /**
     * Costruttore pubblico con la lunghezza specificato
     * @param size lunghezza dello stack
     */
    public Stack(int size) {
        this.head = -1;
        this.size = size;
        this.arr = new int[size];
    }

    /**
     * Metodo per inserire gli elementi dentro l'array
     * se lo stack è pieno, crea un nuovo array con doppio la lunghezza originale
     * Il ciclo for serve per copiare gli elementi originali dentro il nuovo array
     * @param data elemento da inserire
     */
    public void push(int data) {

        if(isFull()) {
            int[] temp = new int[arr.length * 2];

            for(int i = 0; i<arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            size = arr.length;
        }

        arr[++head] = data ;

    }

    /**
     * Metodo per eliminare il primo elemento dello stack
     * @return temp il primo elemento dello stack, return -1 se è vuoto
     */
    public int pop() {
        if(!isEmpty()) {
            int temp = arr[head];
            arr[head] = 0;
            head--;
            return temp;
        }
        else return -1;
    }

    /**
     * Metodo che ritorna il primo elemento dello stack
     * @return un int
     */
    public int peek() {
        return arr[head];
    }

    /**
     * Metodo che controlla se l'array è pieno
     * @return true se è pieno
     */
    public boolean isFull() {
        return (size-1 == head);
    }

    /**
     * Metodo che controlla se l'array è vuoto
     * @return true se è vuoto
     */
    public boolean isEmpty() {
        return (head == -1);
    }
}

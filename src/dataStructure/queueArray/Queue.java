package dataStructure.queueArray;

public class Queue {

    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private int[] arr;
    private static final int MAX_LENGTH = 10;

    /**
     * Costruttore di Coda con la lunghezza prefissata a 10
     */
    public Queue() {
        arr = new int[MAX_LENGTH];
    }

    /**
     * Costruttore di Coda con la lunghezza specificata
     * @param size lunghezza della Coda
     */
    public Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    /**
     * Metodo per inserire un elemento dentro l'array
     * se l'array è piena, crea una nuova array e aggiunge MAX_LENGTH posizioni
     * @param data elemento da inserire
     */
    public void offer(int data) {

        if(isFull()) {
            int[] temp = new int[arr.length + MAX_LENGTH];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }

        arr[tail] = data;
        tail++;
    }


    /**
     * Metodo per eliminare il primo elemento della coda
     * @return temp il primo elemento della coda, return -1 se è vuota
     */
    public int remove() {
        if(!isEmpty()) {
            int val = arr[head];
            arr[head] = 0;
            head++;
            return val;
        }
        else return -1;

    }

    /**
     * Metodo che ritorna il primo elemento dell'array
     * @return il primo elemento, return -1 se è vuota
     */
    public int peek() {
        if(!isEmpty()) {
            return arr[head];
        }
        else return -1;
    }

    /**
     * Metodo per controllare se l'array è vuota
     * @return
     */
    public boolean isEmpty() {
        return (head == tail);
    }

    /**
     * Metodo per controllare se l'array è piena
     * @return
     */
    public boolean isFull() {
        return (arr.length-1 == tail);
    }
}

package dataStructure.stackArray;

public class Stack {

    private int size = 1;
    private Node head = null;
    private Node[] arr;

    /**
     * Costruttore pubblico con la lunghezza specificato
     * @param capacity lunghezza dello stack
     */
    public Stack(int capacity) {
        arr = new Node[capacity+1];
    }

    /**
     * Metodo per inserire un nodo dentro lo stack
     * @param data
     */
    public void push(String data) {
        arr[size++] = new Node(data, this.head) ;
    }

    public void pop() {
        if(!isEmpty()) {
            Node node = arr[size];
            size--;
        }
    }

    public Node peek() {
        return arr[size];
    }
    public boolean isFull() {
        return (size - 1 == size);
    }

    public boolean isEmpty() {
        return (size == -1);
    }

    public int getSize() {
        return size;
    }


}

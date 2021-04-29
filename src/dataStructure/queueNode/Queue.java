package dataStructure.queueNode;

public class Queue {

    private Node head = null;
    private Node tail = null;

    /**
     * Costruttore della Coda
     */
    public Queue() {}

    /**
     * Metodo per inserire un nodo nella coda
     * @param data elemento da inserire
     */
    public void enqueue(String data) {
        if(isEmpty()) {
            this.head = new Node(data, this.head);
        }
        else {

            this.tail = new Node(data, this.head);
        }
    }

    /**
     * Metodo per eliminare il primo nodo nella coda
     */
    public void dequeue() {
        if(!isEmpty()) {

        }
    }

    public Node peek() {
        return this.head;
    }
    public boolean isEmpty() {
        return (head == null && tail == null);
    }
}

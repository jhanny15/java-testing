package dataStructure.stackNode;

public class Stack {

    private Node head = null; //L'ultimo nodo dello Stack che punta a null;

    /**
     * Costruttore pubblico dello stack
     */
    public Stack() {

    }

    /**
     * Metodo per inserire il nodo dentro lo stack
     * @param data del Nodo
     */
    public void push(String data) {
        this.head = new Node (data, this.head);
    }

    /**
     * Metodo che restituisce la testa dello stack
     * @return head (Il primo nodo dello Stack)
     */
    public Node peek() {
        return this.head;
    }

    /**
     * Metodo per eliminare il primo nodo dello Stack
     * solo se esiste un nodo dentro
     */
    public void pop() {
        if(!isEmpty()){
            this.head = this.head.getPointer();
        }

    }

    /**
     * Metodo per controllare se lo stack è vuoto
     * @return true se è vuoto
     */
    public boolean isEmpty() {
        return(this.head==null);
    }

}

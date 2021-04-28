package dataStructure.queueArray;

public class Node {
    private String data;
    Node pointer;

    /** Costruttore privato **/
    public Node() {

    }

    /**
     * Costruttore della classe Node
     * @param data del Node
     * @param pointer  puntatore del Node
     */
    public Node(String data, Node pointer) {
        this.data = data;
        this.pointer = pointer;
    }
}

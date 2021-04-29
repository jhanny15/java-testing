package dataStructure.queueNode;

public class ProvaQueue {

    public static void main(String[] args) {
        Queue coda = new Queue();
        coda.enqueue("a");
        System.out.println(coda.peek().getData());

        coda.enqueue("b");
        System.out.println(coda.peek().getData());

        coda.enqueue("c");
        System.out.println(coda.peek().getData());
    }
}

package dataStructure.queueArray;

public class ProvaQueue {

    public static void main(String[] args) {
        Queue a = new Queue(8);

        for(int i = 0; i < 7; i++) {
            a.offer(i);
        }

        for(int i = 0; i < 8; i++) {
            System.out.println(a.peek());
            a.remove();
        }

    }
}

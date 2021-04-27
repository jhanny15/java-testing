package dataStructure.stackArrayString;

public class ProvaStack {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        for(int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack.peek());
        }
    }
}

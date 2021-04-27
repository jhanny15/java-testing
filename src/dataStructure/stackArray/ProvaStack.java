package dataStructure.stackArray;

public class ProvaStack {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("a");
        System.out.println(stack.peek().getData());

        System.out.println(stack.peek());
    }
}

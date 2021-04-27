package dataStructure.stackArrayString;

public class ProvaStack {

    public static void main(String[] args) {

        Stack stack = new Stack(2);

        for(int i = 0; i < 5; i++) {
            stack.push(i+1);
            System.out.println(stack.peek());
        }


        for(int i = 0; i < 5;i++) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}

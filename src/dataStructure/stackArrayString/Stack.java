package dataStructure.stackArrayString;

import dataStructure.stackArray.Node;

public class Stack {

    private int size = 0;
    private static final int maxLength = 32;
    private int arr[];

    /**
     * Costruttore pubblico con la lunghezza = 32;
     */
    public Stack() {
        arr = new int[maxLength];
    }

    /**
     * Costruttore pubblico con la lunghezza specificato
     * @param size lunghezza dello stack
     */
    public Stack(int size) {
        arr = new int[size];
    }

    public void push(int data) {
        arr[size] = data ;
    }

    public int pop() {
        if(!isEmpty()) {
            return arr[size--];
        }
        return 0;
    }

    public int peek() {
        return arr[size];
    }

    public boolean isEmpty() {
        return (size == -1);
    }
}

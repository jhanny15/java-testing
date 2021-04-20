package javatesting;

public class JavaTesting {

    private int x = 1;
    private int y = 2;

    public int addNum() {
        int num3 = x + y;
        return num3;
    }

    public static void sentence(String a, String b) {
        String c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {

        sentence("Hello", "World");

        JavaTesting num = new JavaTesting();
        System.out.println(num.addNum());

    }
}

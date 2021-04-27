package numIntero;

public class Test {

    int i;

    public Test(int i){
        this.i = i;
    }

    public int copyTest(){
        i++;
        return i;
    }

    public static void main(String[] args) {
        Test test = new Test(5);
        Test test2 = new Test(9);
        System.out.println(test.i + " " + test2.i);
        test = test2;
        System.out.println(test.i + " " + test2.i);
        test2.copyTest();
        System.out.println(test.i + " " + test2.i);


         /*if (!isFull()) {
            Node[] temp = new Node[nodi.length * 2];
            System.arraycopy(nodi, 0, temp, 0, nodi.length);
            nodi = temp;
           }
         */
    }
}

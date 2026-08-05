package reccursion;

public class One2N {
    static void one2n(int a, int b) {
        if(a < 1) return;
        one2n(a-1,b);
        System.out.print(a + " ");
    }
    public static void main(String[] args) {
        one2n(5, 5);
    }
}

package reccursion;

public class OnetoN {
    static int one2n(int a, int b) {
        System.out.print(a + " ");
        if(a < b) return one2n(a+1, b);
        return b;
    }

    public static void main(String[] args) {
        one2n(1,5);
    }
}

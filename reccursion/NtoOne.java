//package reccursion;

public class NtoOne {
    static int n2one(int a, int b) {
        System.out.print(a + " ");
        if(a>b) return n2one(a-1, b);
        return b;
    }
    public static void main(String[] args) {
        n2one(5, 1);
    }
}

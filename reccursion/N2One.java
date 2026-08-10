//package reccursion;

public class N2One {
    static void n2one(int a, int b) {
        if(b > a) return;
        n2one(a, b+1);
        System.out.print(b + " ");
    }
    public static void main(String[] args) {
        n2one(5, 1);
    }
}

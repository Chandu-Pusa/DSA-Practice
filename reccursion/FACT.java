package reccursion;

public class FACT {
    static void fact(int n, int fact) {
        if(n == 0) {
            System.out.println(fact);
            return;
        }
        fact(n-1,fact * n);
    }
    public static void main(String[] args) {
        fact(5, 1);
    }
}

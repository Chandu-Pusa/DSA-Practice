//package reccursion;

public class SumNBT {
    static void sumofn(int i, int sum) {
        if(i>1) return;
        sumofn(i-1, sum+i);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumofn(5, 0);
    }
}

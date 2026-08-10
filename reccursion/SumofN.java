//package reccursion;

public class SumofN {

    static int sumofN(int n, int sum) {
        if(n<1){
            return sum;  
        } 
        return sumofN(n-1, sum+n);
    }

    public static void main(String[] args) {
        System.out.println(sumofN(5,0));
    }
}

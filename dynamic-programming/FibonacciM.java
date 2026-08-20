import java.util.Arrays;

class FibonacciM {
    static int fibonacci(int n, int[] arr) {

        if(n<=1) return n;

        else if(arr[n] != -1) return arr[n];
        
        int ans = fibonacci(n-1, arr) + fibonacci(n-2, arr);

        arr[n] = ans;
        
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        for(int i=0;i<=n;i++) {
            System.out.print(fibonacci(i, arr)+" ");
        }
    }
}
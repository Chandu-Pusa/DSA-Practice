import java.util.Arrays;

public class LeftCycle {
    static String leftCycle(int[] arr,int ind) {
        int n = arr.length;
        if(n == 0) return "[]";

        int[] res = new int[n];
        ind %=n;
        for(int i=0; i<n; i++) {
            res[i] = arr[(ind - i + n)%n];
        }
        return Arrays.toString(res);
    }

    public static void main(String[] args) {
        int[] arr = {7,8,5,5,9,2,2,0,1,6};
        int ind = 2;
        System.out.println(leftCycle(arr, ind));
    }
}

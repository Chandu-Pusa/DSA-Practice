public class ClimbingStairsM {
    static int climb(int n, int[] arr) {

        if(n<=2) return n;

        else if(arr[n] != -1) return arr[n];

        int ans = climb(n-1, arr) + climb(n-2, arr);

        arr[n] = ans;

        return ans;
    }
} 

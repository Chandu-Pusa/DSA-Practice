import java.util.Arrays;

public class LeftRot {
    static String customArr(int[] arr, int ind) {

        int n = arr.length;
        if(n == 0) return "[]";
        int[] res = new int[n];
        ind %= n;
        for(int i=0;i<n;i++) {
            res[i] = arr[(i+ind)%n]; 
        }
        return Arrays.toString(res);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(customArr(arr, 2));
    }
}
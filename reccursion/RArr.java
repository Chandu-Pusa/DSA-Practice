//package reccursion;

import java.util.Arrays;

public class RArr {
    static int[] revArr(int[] arr,int i, int n) {
        if(i >= n/2) return arr;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        return revArr(arr, i+1, n);
    }
    public static void main(String[] args) {
        int i=0;
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(Arrays.toString(revArr(arr, i, n)));
    }
}

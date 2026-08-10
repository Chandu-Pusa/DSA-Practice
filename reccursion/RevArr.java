//package reccursion;

import java.util.*;

public class RevArr {
    static int[] revArr(int[] arr, int left, int right) {

        if(left>=right) return arr;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return revArr(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print(Arrays.toString(revArr(arr, 0, arr.length-1)));

    }
}

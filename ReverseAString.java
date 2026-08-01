import java.util.*;

public class ReverseAString {

    public static String reverseString(String str) {

        char[] arr = str.toCharArray();

        int l=0, r=arr.length - 1;

        while(l<=r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        String result = "";

        for(char i:arr) {
            result += i; 
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = reverseString(str);

        System.out.println(result);

        sc.close();
    }
}
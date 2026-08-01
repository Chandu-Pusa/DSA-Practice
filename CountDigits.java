import java.util.*;

public class CountDigits {

    public static int countDigits(int num) {

        int count = 0;
        while(num > 0) {
            count++;
            num/=10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println(result);

        sc.close();
    }
}
import java.util.*;

public class Fibanocci {

    public static void printFibonacci(int n) {
        int f0 = 0, f1 = 1;

        if(n == 0) {
            System.out.print(0);
            return;
        }

        else if(n == 1) {
            System.out.print(0 +" "+ 1);
            return;
        }

        else {
            System.out.print(0+" "+1+" ");
            for(int i=2;i<n;i++) {
                int fn = f0 + f1;
                System.out.print(fn+" ");
                f0 = f1;
                f1 = fn;
            }

        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}
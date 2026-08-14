
public class CustomArr {
    static int customArr(int[] arr, int ind) {

        int n = arr.length;
        if(n==0) return 0;
        int[] res = new int[n];
        ind %= n;
        for(int i=0;i<n;i++) {
            res[i] = arr[(ind-i+n)%n]; 
        }

        int temp = res[0];
        for(int i=1;i<n;i++) {
            temp ^= res[i];
            res[i] = temp;
        }
        int sum = 0;
        for(int i:res) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,5,5,9,2,2,0,1,6};
        System.out.println(customArr(arr, 2));
    }
}
public class MaxinArr {
    static int maxinArr(int n) {
        int[] arr = new int[n+2];
        arr[0] = 0; arr[1] = 1;
        for (int i = 0; i < n/2+1; i++) {
            arr[i*2] = arr[i];
            if(i*2+1 <= n)
            arr[(i*2)+1] = arr[i+1] + arr[i];
        }
        int max=0;

        for(int i:arr) {
            max = Math.max(i, max);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxinArr(4));
    }
}

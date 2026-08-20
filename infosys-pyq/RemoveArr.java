import java.util.HashMap;

public class RemoveArr {

    static int removeArr(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int maxfreq = 0;
        for(int i:arr) {
            map.put(i,map.getOrDefault(i,0)+1);

            int freq = map.get(i);
            maxfreq = Math.max(freq, maxfreq);
        }
        return Math.max(maxfreq, (n+1)/2);
    }

    public static void main(String[] args) {

        int[] arr = {2,2,1,1};
        System.out.println(removeArr(arr));

    }
}

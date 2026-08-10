import java.util.*;

public class Ksum {
    public static void powerksum(int[] nums, int ind , ArrayList<Integer> current, int k) {
        if(ind == nums.length) {
            int currsum = 0;
            for(int i:current) {
                currsum += i;
            }
            if(currsum ==k ){
                System.out.println(current);
                return;
            }
            else return;
        }
        current.add(nums[ind]);
        powerksum(nums, ind+1, current, k);
        current.remove(current.size()-1);
        powerksum(nums, ind+1, current, k);
    }

        public static void main(String[] args) {
        int ind = 0;
        int[] set = {1,2,1};
        ArrayList<Integer> current = new ArrayList<>();

        powerksum(set, ind, current, 2);
    }
}

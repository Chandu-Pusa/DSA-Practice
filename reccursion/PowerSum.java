import java.util.*;

public class PowerSum {
    public static void subsetsum(int[] nums, int ind, int sum, int k, ArrayList<Integer> current) {
        if(ind == nums.length) {
            if(sum == k) {
                System.out.println(current);
            }
            return;
        }
        current.add(nums[ind]);
        sum+=nums[ind];
        subsetsum(nums, ind+1, sum, k, current);
        current.remove(current.size()-1);
        sum-= nums[ind];
        subsetsum(nums, ind+1, sum, k, current);
    }

    public static void main(String[] args) {
        int ind = 0, sum = 0, k = 2;
        int[] nums = {1,2,1};
        ArrayList<Integer> current = new ArrayList<>();
        subsetsum(nums, ind, sum, k, current);
    }
}

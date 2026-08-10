import java.util.*;

public class Subset1sum {
    public static boolean subset1sum(int[] nums, int ind, int sum, int k, ArrayList<Integer> current) {
        if(ind == nums.length) {
            if(sum == k) {
                System.out.println(current);
                return true;
            }
            return false;
        }
        current.add(nums[ind]);
        sum+=nums[ind];
        if(subset1sum(nums, ind+1, sum, k, current)) return true;
        current.remove(current.size()-1);
        sum-= nums[ind];
        if(subset1sum(nums, ind+1, sum, k, current)) return true;
        
        return false;
    }

    public static void main(String[] args) {
        int ind = 0, sum = 0, k = 2;
        int[] nums = {1,2,1};
        ArrayList<Integer> current = new ArrayList<>();
        subset1sum(nums, ind, sum, k, current);
    }
}


public class SubsetCount {
    public static int subsetcount(int[] nums, int ind, int sum, int k) {
        if(ind == nums.length) {
            if(sum == k) {
                return 1;
            }
            return 0;
        }
        sum+=nums[ind];
        int r = subsetcount(nums, ind+1, sum, k);
        
        sum-= nums[ind];
        int l = subsetcount(nums, ind+1, sum, k);
        
        return r + l;
    }

    public static void main(String[] args) {
        int ind = 0, sum = 0, k = 5;
        int[] nums = {1,2,1,1};
        //ArrayList<Integer> current = new ArrayList<>();
        System.out.println(subsetcount(nums, ind, sum, k));
    }
}

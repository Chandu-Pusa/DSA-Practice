import java.util.*;

public class CombinationSumII {

    static void combiSum(
            int[] arr,
            int ind,
            int target,
            List<List<Integer>> ans,
            List<Integer> curr) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = ind; i < arr.length; i++) {

            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            curr.add(arr[i]);

            combiSum(arr, i + 1, target - arr[i], ans, curr);

            curr.remove(curr.size() - 1);
        }
    }

    static List<List<Integer>> combinationSum(int[] arr, int target) {

        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        combiSum(arr, 0, target, ans, curr);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> ans = combinationSum(arr, target);

        System.out.println(ans);
    }
}


// import java.util.*;

// public class CombinationSum {
//     static void combiSum(int[] arr, int ind, int target, List<List<Integer>> ans, List<Integer> curr) {
//         if(ind == arr.length) {
//             if(target == 0) {
//                 ans.add(new ArrayList<>(curr));
//             }
//             return;
//         }
//         if(arr[ind] <= target) {
//             curr.add(arr[ind]);
//             combiSum(arr, ind, target - arr[ind], ans, curr);
//             curr.remove(curr.size()-1);
//         }
//         combiSum(arr, ind+1, target, ans, curr);
//     }

//     static List<List<Integer>> combinationSum(int[] arr, int target) {
//         int ind = 0;
//         List<Integer> curr = new ArrayList<>();
//         List<List<Integer>> ans = new ArrayList<>();
//         combiSum(arr, ind, target, ans, curr);
//         return ans;
//     }

//     public static void main(String[] args) {
        
//     }
// }


import java.util.*;

public class CombinationSum {

    static void combiSum(
            int[] arr,
            int ind,
            int target,
            List<List<Integer>> ans,
            List<Integer> curr) {

        // Base case
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        // Pick the current element
        if (arr[ind] <= target) {
            curr.add(arr[ind]);

            // Stay at the same index because an element
            // can be used multiple times
            combiSum(arr, ind, target - arr[ind], ans, curr);

            // Backtrack
            curr.remove(curr.size() - 1);
        }

        // Don't pick the current element
        combiSum(arr, ind + 1, target, ans, curr);
    }

    static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        combiSum(arr, 0, target, ans, curr);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ans = combinationSum(arr, target);

        System.out.println(ans);
    }
}


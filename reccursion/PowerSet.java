import java.util.*;

public class PowerSet {
    public static void powerset(int[] set, int ind, ArrayList<Integer> current) {
        if(ind == set.length) {
            System.out.println(current);
            return;
        }
        current.add(set[ind]);
        powerset(set, ind+1, current);
        current.remove(current.size()-1);
        powerset(set, ind+1, current);
    }
    public static void main(String[] args) {
        int ind = 0;
        int[] set = {3,2,1};
        ArrayList<Integer> current = new ArrayList<>();

        powerset(set, ind, current);
    }
}
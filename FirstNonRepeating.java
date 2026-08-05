import java.util.*;

public class FirstNonRepeating {

    public static String firstNonRepeating(String s) {

        // Write your logic here
        HashMap<Character, Integer> freq = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            queue.offer(ch);

            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                ans.append('#');
            } 

            else {
                ans.append(queue.peek());
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(firstNonRepeating(s));

        sc.close();
    }
}
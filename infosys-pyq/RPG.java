import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RPG {

    static int rpg(int n, int exp, int[] p, int[] bo) {

        List<int[]> bosses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            bosses.add(new int[]{p[i], bo[i]});
        }

        bosses.sort((a, b) -> a[0] - b[0]);

        int count = 0;

        for (int[] boss : bosses) {
            int requiredExp = boss[0];
            int gainedExp = boss[1];

            if (requiredExp > exp) {
                break;
            }

            exp += gainedExp;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int exp = sc.nextInt();

        int[] p = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(rpg(n, exp, p, b));
    }
}
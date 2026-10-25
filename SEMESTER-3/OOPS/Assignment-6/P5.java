import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0, prev = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (i == 0 || x != prev) ans++;
            prev = x;
        }

        System.out.println(ans);
        sc.close();
    }
}
import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int x : a)
            if (x != 0) b[j++] = x;

        for (int x : b) System.out.print(x + " ");
        sc.close();
    }
}
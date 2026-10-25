package driver;

import java.util.*;
import logic.*;

public class P5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();
        int n5 = s.nextInt();
        GcdLcmUtility g = new GcdLcmUtility(n1, n2, n3, n4, n5);
        g.display();
    }
}

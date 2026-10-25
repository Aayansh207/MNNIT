package driver;

import java.util.*;
import java.time.*;
import logic.*;

public class P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String n = s.nextLine();

        System.out.print("Father's Name: ");
        String f = s.nextLine();

        System.out.print("DOB (yyyy-mm-dd): ");
        LocalDate d = LocalDate.parse(s.nextLine());

        System.out.print("Registration No: ");
        long r = s.nextLong();
        s.nextLine();

        System.out.print("Degree: ");
        String q = s.nextLine();

        System.out.print("Percentage: ");
        double m = s.nextDouble();

        GenericPersonRecord<Long> p =
            new GenericPersonRecord<>(n, f, d, r, q, m);

        System.out.println("\nRecord:");
        p.display();
    }
}

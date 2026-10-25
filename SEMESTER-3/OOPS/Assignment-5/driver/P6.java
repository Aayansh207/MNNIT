package driver;

import logic.WrapperDigitalLock;
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[][] keys = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {2, 4, 6},
            {9, 8, 7}
        };

        WrapperDigitalLock lockSystem =new WrapperDigitalLock(keys);
        while (true) {
            System.out.print("\nEnter Lock Number (1-5): ");
            Integer lockNumber = sc.nextInt() - 1;
            if (lockNumber < 0 || lockNumber >= 5) {
                System.out.println("Invalid Lock!");
                continue;
            }

            if (!lockSystem.isLocked(lockNumber)) {
                System.out.println("Lock already opened!");
                continue;
            }

            Integer[] enteredKey = new Integer[3];
            System.out.println("Enter security key:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Digit " + (i + 1) + ": ");
                enteredKey[i] = sc.nextInt();
            }

            boolean result=lockSystem.tryOpen(lockNumber, enteredKey);

            if (result) {
                System.out.println("Correct Key!");
                System.out.println("Lock Opened.");
            } else {
                System.out.println("Incorrect Key!");
                System.out.println("Try Again.");
            }
        }
    }
}
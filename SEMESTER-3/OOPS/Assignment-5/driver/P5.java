package driver;

import logic.GenericDigitalLock;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericDigitalLock<Byte> lock1 =new GenericDigitalLock<>(new Byte[]{1, 2, 3});
        GenericDigitalLock<Short> lock2 =new GenericDigitalLock<>(new Short[]{10, 20, 30});
        GenericDigitalLock<Integer> lock3 =new GenericDigitalLock<>(new Integer[]{4, 5, 6});
        GenericDigitalLock<Boolean> lock4 =new GenericDigitalLock<>(new Boolean[]{true, false, true});
        GenericDigitalLock<Integer> lock5 =new GenericDigitalLock<>(new Integer[]{7, 8, 9});
        System.out.println("Testing Generic Digital Locks");
        System.out.println("\nLock 1:");
        Byte[] input1 = new Byte[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter byte value: ");
            input1[i] = sc.nextByte();
        }
        if (lock1.tryOpen(input1)) {
            System.out.println("Lock 1 Opened!");
        } else {
            System.out.println("Wrong Key!");
        }
        System.out.println("\nLock 3:");
        Integer[] input3 = new Integer[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter integer value: ");
            input3[i] = sc.nextInt();
        }
        if (lock3.tryOpen(input3)) {
            System.out.println("Lock 3 Opened!");
        } else {
            System.out.println("Wrong Key!");
        }
    }
}
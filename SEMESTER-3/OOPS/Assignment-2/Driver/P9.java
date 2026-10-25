package driver;

import logic.DigitalLockQ9;

public class P9 {
    public static void main(String[] args){
        DigitalLockQ9 lock=new DigitalLockQ9(1,2,3);

        lock.enterDigit(1);
        lock.displayStatus();

        lock.enterDigit(2);
        lock.displayStatus();

        lock.enterDigit(3);
        lock.displayStatus();
    }
}
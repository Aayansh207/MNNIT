package driver;

import logic.DigitalLockQ8;

public class P8 {
    public static void main(String[] args){
        DigitalLockQ8 lock=new DigitalLockQ8(1,2,3);

        lock.enterDigit(5);
        lock.displayStatus();

        lock.enterDigit(1);
        lock.displayStatus();

        lock.enterDigit(2);
        lock.displayStatus();

        lock.enterDigit(3);
        lock.displayStatus();
    }
}
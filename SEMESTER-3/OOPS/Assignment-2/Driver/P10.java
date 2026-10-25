package driver;

import logic.DigitalLockQ10;

public class P10 {
    public static void main(String[] args){
        DigitalLockQ10 lock=new DigitalLockQ10(4,5,6,7);

        lock.enterDigit(4);
        lock.displayStatus();

        lock.enterDigit(5);
        lock.displayStatus();

        lock.enterDigit(6);
        lock.displayStatus();

        lock.enterDigit(7);
        lock.displayStatus();
    }
}
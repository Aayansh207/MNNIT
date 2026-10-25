package driver;
import logic.DigitalLock;

public class P4{
    public static void main(String[] args){
        int[][] keys={{1,2,3},{4,5,6},{7,8,9},{2,4,6},{8,7,5}};
        DigitalLock d=new DigitalLock(keys);
        d.openLocks();
    }
}


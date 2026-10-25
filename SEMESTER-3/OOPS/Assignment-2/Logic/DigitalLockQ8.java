package logic;

public class DigitalLockQ8 {
    private int key1,key2,key3;
    private int d1=-1,d2=-1,d3=-1;
    private boolean unlocked=false;

    public DigitalLockQ8(int key1,int key2,int key3){
        this.key1=key1;
        this.key2=key2;
        this.key3=key3;
    }

    public void enterDigit(int digit){
        d1=d2;
        d2=d3;
        d3=digit;
        checkLock();
    }

    public void checkLock(){
        unlocked=(d1==key1&&d2==key2&&d3==key3);
    }

    public void displayStatus(){
        System.out.println(unlocked?"Unlocked":"Locked");
    }
}
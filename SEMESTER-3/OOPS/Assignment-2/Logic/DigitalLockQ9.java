package logic;

public class DigitalLockQ9 {
    private int key1,key2,key3;
    private int state=0;
    private boolean unlocked=false;

    public DigitalLockQ9(int key1,int key2,int key3){
        this.key1=key1;
        this.key2=key2;
        this.key3=key3;
    }

    public void enterDigit(int digit){
        checkLock(digit);
    }

    public void checkLock(int digit){
        if(state==0){
            if(digit==key1)
                state=1;
        }
        else if(state==1){
            if(digit==key2)
                state=2;
            else if(digit==key1)
                state=1;
            else
                state=0;
        }
        else if(state==2){
            if(digit==key3){
                unlocked=true;
                state=0;
            }
            else if(digit==key1)
                state=1;
            else
                state=0;
        }
    }

    public void displayStatus(){
        System.out.println(unlocked?"Unlocked":"Locked");
    }
}
package logic;

public class DigitalLockQ10 {
    private int[] code=new int[4];
    private int state=0;
    private boolean unlocked=false;

    public DigitalLockQ10(int a,int b,int c,int d){
        code[0]=a;
        code[1]=b;
        code[2]=c;
        code[3]=d;
    }

    public void enterDigit(int digit){
        checkLock(digit);
    }

    public void checkLock(int digit){
        if(digit==code[state]){
            state++;
            if(state==4){
                unlocked=true;
                state=0;
            }
        }
        else{
            if(digit==code[0])
                state=1;
            else
                state=0;
        }
    }

    public void displayStatus(){
        if(unlocked)
            System.out.println("Access Granted");
        else
            System.out.println("Locked");
    }
}
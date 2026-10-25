package logic;

public class Lock{
    int key;
    boolean locked;
    public Lock(int key){
        this.key=key;
        locked=true;
    }

    public boolean checkKey(int input){
        if(input==key){
            locked=false;
            return true;
        }
        return false;
    }
}


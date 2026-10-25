package logic;
import java.util.Scanner;

public class DigitalLock {
    int[][] keys;
    Lock[] locks;
    public DigitalLock(int[][] keys){
        this.keys=keys;
        locks=new Lock[5];
        for(int i=0;i<5;i++){
            locks[i]=new Lock(0);
        }
    }

    public void openLocks(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("\nLock "+(i+1));
            int position=0;
            while(locks[i].locked){
                System.out.print("Enter digit: ");
                int digit=sc.nextInt();
                if(digit==keys[i][position]){
                    position++;
                    if(position==3){
                        locks[i].locked=false;
                        System.out.println("Lock "+(i+1)+" opened!");
                    }
                }
                else{
                    System.out.println("Wrong digit. Start again.");
                    position=0;
                }
            }
        }
        sc.close();
    }
}


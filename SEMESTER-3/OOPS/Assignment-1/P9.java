import java.util.Scanner;

public class P9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Set 3 security keys:");
        int k1=sc.nextInt();
        int k2=sc.nextInt();
        int k3=sc.nextInt();

        int state=0;

        System.out.println("Enter digits one at a time:");

        while(true){
            int digit=sc.nextInt();

            if(state==0){
                if(digit==k1){state=1;}
            }
            else if(state==1){
                if(digit==k2){state=2;}
                else if(digit!=k1){state=0;}
            }
            else if(state==2){
                if(digit==k3){System.out.println("Lock opened");break;}
                else if(digit==k1){state=1;}
                else{state=0;}
            }
        }
        sc.close();
    }
}
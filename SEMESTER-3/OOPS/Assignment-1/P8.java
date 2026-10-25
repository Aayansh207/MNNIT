import java.util.Scanner;

public class P8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Set 3 security keys:");
        int k1=sc.nextInt();
        int k2=sc.nextInt();
        int k3=sc.nextInt();
        int a=-1,b=-1,c=-1;
        System.out.println("Enter digits one at a time:");
        while(true){
            int digit=sc.nextInt();
            a=b;
            b=c;
            c=digit;
            if(a==k1 && b==k2 && c==k3){
                System.out.println("Lock opened");
                break;
            }
        }

        sc.close();
    }
}
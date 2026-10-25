import java.util.Scanner;

public class P5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int gcd=n;
        int lcm=n;
        for(int i=1;i<5;i++){
            System.out.print("Enter number: ");
            n=sc.nextInt();
            int a=gcd;
            int b=n;
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            gcd=a;
            lcm=lcm/gcd*n;
        }
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);

        sc.close();
    }
}
import java.util.Scanner;

public class P4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter number: ");
            int n=sc.nextInt();
            boolean prime=true;
            if(n<2) prime=false;
            else{
                for(int j=2;j*j<=n;j++){
                    if(n%j==0){
                        prime=false;
                        break;
                    }
                }
            }
            if(prime) System.out.println(n+" is prime");
            else System.out.println(n+" is not prime");
        }
        sc.close();
    }
}
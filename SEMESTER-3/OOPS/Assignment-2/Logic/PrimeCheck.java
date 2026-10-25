package Logic;

import java.util.Scanner;

public class PrimeCheck{

    int num1,num2,num3,num4,num5;

    Scanner sc=new Scanner(System.in);

    public void getInput(){

        System.out.print("Enter first number: ");
        num1=sc.nextInt();

        System.out.print("Enter second number: ");
        num2=sc.nextInt();

        System.out.print("Enter third number: ");
        num3=sc.nextInt();

        System.out.print("Enter fourth number: ");
        num4=sc.nextInt();

        System.out.print("Enter fifth number: ");
        num5=sc.nextInt();
    }

    public boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        for(int i=2;i<=n/2;i++){

            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public void displayResult(){

        System.out.println(num1+(isPrime(num1)?" is Prime":" is Not Prime"));
        System.out.println(num2+(isPrime(num2)?" is Prime":" is Not Prime"));
        System.out.println(num3+(isPrime(num3)?" is Prime":" is Not Prime"));
        System.out.println(num4+(isPrime(num4)?" is Prime":" is Not Prime"));
        System.out.println(num5+(isPrime(num5)?" is Prime":" is Not Prime"));
    }
}


package Logic;

import java.util.Scanner;

public class GCDLCM{

    int num1,num2,num3,num4,num5;
    int gcd,lcm;

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

    public int findGCD(int a,int b){

        while(b!=0){

            int temp=b;
            b=a%b;
            a=temp;
        }

        return a;
    }

    public int findLCM(int a,int b){

        return (a*b)/findGCD(a,b);
    }

    public void calculateGCDLCM(){

        gcd=findGCD(num1,num2);
        gcd=findGCD(gcd,num3);
        gcd=findGCD(gcd,num4);
        gcd=findGCD(gcd,num5);

        lcm=findLCM(num1,num2);
        lcm=findLCM(lcm,num3);
        lcm=findLCM(lcm,num4);
        lcm=findLCM(lcm,num5);
    }

    public void displayResult(){

        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    }
}


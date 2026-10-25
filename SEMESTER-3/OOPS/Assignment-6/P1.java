import java.util.*;

public class P1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int u = sc.nextInt();
        double b;

        if(u<=100) b=u*2;
        else if(u<=200) b=200+(u-100)*5;
        else if(u<=500) b=700+(u-200)*7;
        else b=2800+(u-500)*10;
        if(b>3000) b*=1.05;
        System.out.println(b);
        sc.close();
    }
}
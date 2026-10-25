import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>max){
                second=max;
                max=x;
            }
            else if(x>second && x!=max){
                second=x;
            }
        }

        System.out.println(max + second);
        sc.close();
    }
}
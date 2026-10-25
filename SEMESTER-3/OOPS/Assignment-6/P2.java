import java.util.*;

public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int empty=0;
        int low=0;
        int well=0;

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==0){empty++;}
            else if(x<10){low++;}
            else well++;
        }

        System.out.println(empty);
        System.out.println(low);
        System.out.println(well);

        if((empty+low)*100>25*n){System.out.println("Restock Required");}
        else{System.out.println("Inventory Sufficient");}
        sc.close();
    }
}
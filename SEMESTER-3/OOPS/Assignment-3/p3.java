class GCDLCMUtil{
    static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    static int lcm(int a,int b){
        return Math.abs(a*b)/gcd(a,b);
    }
}

class NumberUtil{
    static int n1,n2,n3,n4,n5;
    static{n1=12;n2=18;n3=24;n4=30;n5=36;}
    static int gcd(int a,int b){return GCDLCMUtil.gcd(a,b);}
    static int gcd(int a,int b,int c){
        int result=GCDLCMUtil.gcd(a,b);
        result=GCDLCMUtil.gcd(result,c);
        return result;
    }
    static int gcd(int a,int b,int c,int d,int e){
        int result=GCDLCMUtil.gcd(a,b);
        result=GCDLCMUtil.gcd(result,c);
        result=GCDLCMUtil.gcd(result,d);
        result=GCDLCMUtil.gcd(result,e);
        return result;
    }
    static int lcm(int a,int b){return GCDLCMUtil.lcm(a,b);}
    static int lcm(int a,int b,int c){
        int result=GCDLCMUtil.lcm(a,b);
        result=GCDLCMUtil.lcm(result,c);
        return result;
    }
    static int lcm(int a,int b,int c,int d,int e){
        int result=GCDLCMUtil.lcm(a,b);
        result=GCDLCMUtil.lcm(result,c);
        result=GCDLCMUtil.lcm(result,d);
        result=GCDLCMUtil.lcm(result,e);
        return result;
    }
}

public class p3{
    public static void main(String[] args){
        System.out.println("GCD of 2 numbers = "+NumberUtil.gcd(NumberUtil.n1,NumberUtil.n2));
        System.out.println("GCD of 3 numbers = "+NumberUtil.gcd(NumberUtil.n1,NumberUtil.n2,NumberUtil.n3));
        System.out.println("GCD of 5 numbers = "+NumberUtil.gcd(NumberUtil.n1,NumberUtil.n2,NumberUtil.n3,NumberUtil.n4,NumberUtil.n5));

        System.out.println("LCM of 2 numbers = "+NumberUtil.lcm(NumberUtil.n1,NumberUtil.n2));
        System.out.println("LCM of 3 numbers = "+NumberUtil.lcm(NumberUtil.n1,NumberUtil.n2,NumberUtil.n3));
        System.out.println("LCM of 5 numbers = "+NumberUtil.lcm(NumberUtil.n1,NumberUtil.n2,NumberUtil.n3,NumberUtil.n4,NumberUtil.n5));
    }
}

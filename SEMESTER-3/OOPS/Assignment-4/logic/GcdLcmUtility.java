package logic;

public final class GcdLcmUtility {
    private final int a, b, c, d, e;

    public GcdLcmUtility(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }

    private int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public int getGCD() {
        return gcd(gcd(gcd(gcd(a, b), c), d), e);
    }

    public int getLCM() {
        return lcm(lcm(lcm(lcm(a, b), c), d), e);
    }

    public void display() {
        System.out.println("Numbers: " + a + " " + b + " " + c + " " + d + " " + e);
        System.out.println("GCD: " + getGCD());
        System.out.println("LCM: " + getLCM());
    }
}

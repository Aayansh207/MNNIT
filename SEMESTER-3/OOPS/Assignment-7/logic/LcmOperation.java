package logic;

public class LcmOperation extends IntegerOperation {

    @Override
    protected int combine(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        int x = Math.abs(a);
        int y = Math.abs(b);
        int p = x;
        int q = y;

        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }

        return Math.abs((x / p) * y);
    }
}


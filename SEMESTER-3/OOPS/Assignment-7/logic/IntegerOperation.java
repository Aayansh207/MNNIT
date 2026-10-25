package logic;

public abstract class IntegerOperation {
    protected abstract int combine(int a, int b);
    public int evaluate(int a, int b) {
        return combine(a, b);
    }

    public int evaluate(int a, int b, int c) {
        return combine(combine(a, b), c);
    }

    public int evaluate(int a, int b, int c, int d, int e) {
        return combine(
                combine(
                        combine(
                                combine(a, b), c
                        ), d
                ), e
        );
    }
}


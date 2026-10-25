package logic;

public final class ShapeUtility {
    private final double a, b;
    private final int type;

    public ShapeUtility(int a, int b) {
        this.a = a;
        this.b = b;
        type = 1;
    }

    public ShapeUtility(float a, float b) {
        this.a = a;
        this.b = b;
        type = 1;
    }

    public ShapeUtility(long a, long b) {
        this.a = a;
        this.b = b;
        type = 1;
    }

    public ShapeUtility(double a, double b) {
        this.a = a;
        this.b = b;
        type = 1;
    }

    public ShapeUtility(double r) {
        a = r;
        b = 0;
        type = 2;
    }

    public double area() {
        if (type == 1)
            return a * b;
        return Math.PI * a * a;
    }

    public double perimeter() {
        if (type == 1)
            return 2 * (a + b);
        return 2 * Math.PI * a;
    }

    public double rhombusArea() {
        return a * b / 2;
    }
}

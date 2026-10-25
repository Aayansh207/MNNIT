package logic;

public final class GenericShapeUtility<T extends Number, U extends Number> {
    private final double a, b;

    public GenericShapeUtility(T a, U b) {
        this.a = a.doubleValue();
        this.b = b.doubleValue();
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public double rhombusArea() {
        return a * b / 2;
    }
}

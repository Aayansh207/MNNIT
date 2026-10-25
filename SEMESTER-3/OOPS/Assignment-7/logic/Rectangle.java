package logic;

public class Rectangle extends PlaneShape {
    private float length;
    private double breadth;
    public Rectangle(float length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double diagonal() {
        return Math.sqrt((length * length) + (breadth * breadth));
    }
}


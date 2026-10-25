package logic;

public final class Rhombus {
    private final double diagonal1;
    private final double diagonal2;
    private final double side;
    public Rhombus(int d1, int d2, int side) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        this.side = side;
    }
    public Rhombus(float d1, float d2, float side) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        this.side = side;
    }
    public Rhombus(long d1, long d2, long side) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        this.side = side;
    }
    public Rhombus(double d1, double d2, double side) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        this.side = side;
    }
    public Rhombus(int d1, double d2, float side) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        this.side = side;
    }
    public double getDiagonal1() {return diagonal1;}
    public double getDiagonal2() {return diagonal2;}
    public double getSide() {return side;}
}


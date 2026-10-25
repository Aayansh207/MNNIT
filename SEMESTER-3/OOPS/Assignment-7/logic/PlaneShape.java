package logic;

public abstract class PlaneShape implements Measurable {
    public void displayMeasurements() {
        System.out.println("Area      : " + area());
        System.out.println("Perimeter : " + perimeter());
        System.out.println("Diagonal  : " + diagonal());
    }
}


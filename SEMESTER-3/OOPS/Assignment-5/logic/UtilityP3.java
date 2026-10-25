package logic;

public class UtilityP3 {
    public static <T extends Number> double area(RectangleP3<T> r){
        return r.getLength().doubleValue()*r.getBreadth().doubleValue();
    }
    public static <T extends Number> double perimeter(RectangleP3<T> r) {
        return 2*(r.getLength().doubleValue()+r.getBreadth().doubleValue());
    }
    public static <T extends Number> double area(CircleP3<T> c){
        double r=c.getRadius().doubleValue();
        return Math.PI*r*r;
    }

    public static <T extends Number> double perimeter(CircleP3<T> c){
        return 2*Math.PI*c.getRadius().doubleValue();
    }
    public static <T extends Number> double area(RhombusP3<T> r){
        return (r.getDiagonal1().doubleValue()*r.getDiagonal2().doubleValue())/2;
    }
    public static <T extends Number> double perimeter(RhombusP3<T> r){
        return 4*r.getSide().doubleValue();
    }
}


package logic;

public class Utility {
    public static double area(Rectangle r){
        return r.getLength()*r.getBreadth();
    }
    public static double perimeter(Rectangle r){
        return 2*(r.getLength()+r.getBreadth());
    }
    
    public static double area(Circle c){
        return Math.PI*c.getRadius()*c.getRadius();
    }
    public static double perimeter(Circle c){
        return 2*Math.PI*c.getRadius();
    }

    public static double area(Rhombus r){
        return(r.getDiagonal1()*r.getDiagonal2())/2;
    }
    public static double perimeter(Rhombus r){
        return 4*r.getSide();
    }
}


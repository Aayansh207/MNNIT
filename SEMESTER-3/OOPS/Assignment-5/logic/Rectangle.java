package logic;

public final class Rectangle {
    private final double length;
    private final double breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(long length,long breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(int length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(double length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getLength(){return length;}
    public double getBreadth(){return breadth;}
}


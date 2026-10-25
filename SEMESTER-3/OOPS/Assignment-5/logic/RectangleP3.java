package logic;

public class RectangleP3<T extends Number>{
    private final T length;
    private final T breadth;
    public RectangleP3(T length,T breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public T getLength() {return length;}
    public T getBreadth() {return breadth;}
}


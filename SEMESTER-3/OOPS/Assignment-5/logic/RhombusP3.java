package logic;

public class RhombusP3<T extends Number> {
    private final T diagonal1;
    private final T diagonal2;
    private final T side;
    public RhombusP3(T diagonal1, T diagonal2, T side) {
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
        this.side=side;
    }
    public T getDiagonal1(){return diagonal1;}
    public T getDiagonal2(){return diagonal2;}
    public T getSide(){return side;}
}


package l.fixed;

public class Square implements AreaCaculation{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }

}

package SHape;

public class Square extends Shape
{
    private final double side;
    public  Square(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

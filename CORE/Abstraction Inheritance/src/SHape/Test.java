package SHape;

public class Test
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(2.5);
        System.out.printf("Area of circle: %.3f\n", circle.getArea());
        Square square = new Square(5);
        System.out.println(square.getArea());
    }
}

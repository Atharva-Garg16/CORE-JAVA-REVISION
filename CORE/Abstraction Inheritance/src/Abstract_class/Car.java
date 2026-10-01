package Abstract_class;

public class Car extends Vehicle
{
private int numOfDoors;

    public Car() {
        super(4);// calling parent constructor with 4 as a param
    }
}
class Test
{
    public static void main(String[] args)
    {
//        Vehicle vehicle = new Vehicle(7); Now vehicle class is abstract that is we can't create its object we'd to inherit it than......
        Car car = new Car();
        car.commute();
    }
}


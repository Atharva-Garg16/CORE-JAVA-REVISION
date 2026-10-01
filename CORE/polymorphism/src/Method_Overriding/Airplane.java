package Method_Overriding;

public class Airplane implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Airplane driving");
    }
}

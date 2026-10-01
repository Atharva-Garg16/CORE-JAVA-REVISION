package Method_Overriding;

public class Test {
    static void method(Vehicle vehicle) {
        vehicle.drive();
    }
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter();
        Car car = new Car();
        Airplane airplane = new Airplane();
        method(helicopter);
        method(car);
        method(airplane);
        // ab agar future mai koi naya vehicle aaye to interface mai koi change krne ki zarurat nhi hai

    }
}

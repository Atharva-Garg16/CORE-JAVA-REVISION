package Compile_time;

class Car {
    String color;
    int wheels;
    Car(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }
    Car(String color) {
        this.color = color;
        this.wheels = 4;
    }
    Car() {
        this.color = "black";
        this.wheels = 4;
    }
}
public class ConstructorOverload {
    public static void main(String[] args) {
        Car car1 = new Car("red", 4);
        System.out.printf("Number of wheels=%d\ncolour =%s\n\n", car1.wheels, car1.color);
        Car car2 = new Car();
        System.out.printf("Number of wheels=%d\ncolour =%s", car2.wheels, car2.color);

    }
}

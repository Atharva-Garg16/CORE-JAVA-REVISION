package overrideMethod;

public class Cat extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("meow-meow");
    }
}

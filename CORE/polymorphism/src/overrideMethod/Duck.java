package overrideMethod;

public class Duck extends Animal {
    @Override
    public void sound() {
        System.out.println("quack-quack");
    }
}

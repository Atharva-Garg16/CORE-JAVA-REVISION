class Dog{
    String name;
    int age;
    String color;
    Dog(String name,int age){
        this(name,age,"black");
    }
    Dog(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    // overriding toString()
    // by default return HashCode followed by @

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
class TestDog{
    static void main() {
        Dog d1 = new Dog("d1",18);
        Dog d2 = new Dog("d2",19,"blue");
        System.out.println(d1);
        System.out.println(d2);// directly call toString()
    }
}
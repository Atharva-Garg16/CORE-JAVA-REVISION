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
/**Implemented by String concatenation*/
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", color='" + color + '\'' +
//                '}';
//    }
    /**Implemented by StringBuilder*/
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
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
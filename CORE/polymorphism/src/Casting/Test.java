package Casting;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Child();
        // this above is upcasting
//        Child child = new Parent(); we can't down-cast directly just like we can't assign a double value to int directly without forced cast i.e.
//    Child ch1=(Child) new Parent();// raise exception
        Object ref=new Child();// object == sab class ka papa
    }
}

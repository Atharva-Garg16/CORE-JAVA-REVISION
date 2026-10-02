package Final_keyword;

//public class Test1 extends Car{
//}
//Cannot inherit from final class 'Final_keyword.Car'
public class Test1 {
    final void test() {
        System.out.println("this method is final means we can't override it");

    }
}
class Test2 extends Test1 {
//    void test(){
//        'test()' cannot override 'test()' in 'Final_keyword.Test1'; overridden method is final
//    }

}
class test{
    static void main() {
        final double PI=3.14159;
//        PI=123;Cannot assign a value to final variable 'PI'
    }
}
//final interface cl{
///'''illegal combination of modifiers: interface and final''
//}

package Test2;

//import com.Test1.A;
import com.Test1.Check;
import com.Test1.Test;

public class VerifyOut {

//    A a=new A();// A can't be accessed outside the package
    /**In java there are 4 types of access modifiers that are:
     * 1. public can be accessed from outside the package
     * 2. protected can be accessed in the package and derived classes
     * 3. default (NO keyword) can be accessed within the package
     * 4.private access within the class only
     * -------------------------------------------------------------
     * Methods and variables(instance var) can be of all 4 types,
     * classes can either be default or public */
    static void main() {
        Test test = new Test();
        test.age=15;
        test.name="A";
//        test.roll="123";// 'roll' is not public in 'com.Test1.Test'. Cannot be accessed from outside package
//        test.account=123;'account' has private access in 'com.Test1.Test'
    }
}

public class Exception_Stack
{
    static void b(){
       int k= 3/0;
        System.out.print("Ye nhi chlega");
    }
    static void a(){
        b();
        // yaha dekhega try catch hai kya
        // agar nhi hai to b(); pr break
    }
    static void main() {
        a();
    }
}
/**Exception in thread "main" java.lang.ArithmeticException: / by zero
 at Exception_Stack.b(Exception_Stack.java:4)
 at Exception_Stack.a(Exception_Stack.java:7)
 at Exception_Stack.main(Exception_Stack.java:10)*/
// Sabse pahle usne b ko dekha ki wo kisi try catch block mai hai and than go back to function called..... and finally to main method?
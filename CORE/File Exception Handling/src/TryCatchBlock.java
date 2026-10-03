import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e) // (className obj)
        {
            System.out.printf(e.getMessage());
            System.out.println("\ndivision by zero na kare");
        }
        // Exception class Saare Exceptions ka papa hai
        ///
        /// object --> Throwable --> Exception and that has multiple class
        /// like IOException ArithmeticException ,etc.
        /// we can give multiple catch blocks , go from subclass to superclasses
        ///last class is Exception don't use as first as it's capable of handling all type of exceptions (Polymorphism concept)
        /// is a relation
    }
}

public class Code_Blocks {
    static int initial;

    {
        // scope within this curly braces
        // Variable inside it aren't accessible outside
        // called before constructor
        initial+=1;
        System.out.println("this is code block "+initial);
    }
    static {
        // runs only at the time of class loading
        initial=0;
        System.out.println("called at time of class loading");

    }
    Code_Blocks(){
        System.out.println("constructor");
    }
}
class  Code_Blocks_Test {
    static void main() {
        System.out.println(Code_Blocks.initial);
        Code_Blocks obj = new Code_Blocks();
        Code_Blocks obj2 = new Code_Blocks();
    }
    // stack -> references or class or primitives (Order LIFO) Static
    // Heap -> Object , array ,etc (No order) Dynamic
}
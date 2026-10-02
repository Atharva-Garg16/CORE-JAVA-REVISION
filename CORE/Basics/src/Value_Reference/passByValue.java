package Value_Reference;

public class passByValue {
    public static void change(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    public static void main(String[] args) {
        int a=10,b=5;
        change(10,5);
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        // doesn't affect original value
    }
}

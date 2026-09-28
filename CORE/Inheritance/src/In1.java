public class In1 {
    // By default object class is parent of every class
    // so every class has methods like getClass(), hashCode(), wait(),toString(),equals()
    static void main() {
        In1 in1=new In1();
        In1 in2=new In1();
        System.out.println(in1.getClass());
        System.out.println(in1.hashCode());
        System.out.println(in1.equals(in2));
    }
}

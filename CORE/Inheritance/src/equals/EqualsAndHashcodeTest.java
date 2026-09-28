package equals;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        Person p1=new Person("Raj",30,78_888_888);
        Person p2=new Person("Raj",30,78_888_888);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        System.out.println(p1.hashCode() == p2.hashCode());

    }
}

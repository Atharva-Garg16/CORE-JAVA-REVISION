package Generic_class;

public class Generic_Class <T> {
    private  T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}

// T may be String , Integer , Boolean....
class testGeneric_Class {
    static void main() {
        /// set null value by default as Object type has default value null
        /// to use a generic class ....
        Generic_Class<String> g = new Generic_Class<String>();
        g.setValue("Hello");
        System.out.println(g.getValue());
        Generic_Class<Integer> g2 = new Generic_Class<Integer>();
        g2.setValue(123);
        System.out.println(g2.getValue());
        Generic_Class<Boolean> g3 = new Generic_Class<Boolean>();
        System.out.println(g3.getValue());
        g3.setValue(true);
        System.out.println(g3.getValue());
        Generic_Class<Student> g4 = new Generic_Class<Student>();
        Student student = new Student("Rohit");
        g4.setValue(student);
        System.out.println(g4.getValue());
    }
}
class Student{
    private final String name;
    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name+" object toString overridden ";
    }
}
/** CONSTRUCTOR IS MEMBER FUNCTION OR METHOD WITH SAME NAME AS CLASS NAME
 * IT HAS NO RETURN TYPE
 * USE TO INITIALIZE THE OBJECT ATTRIBUTES OR METHODS
 * IT IS AUTOMATICALLY CALLED WHEN OBJECT IS CREATED
 * TYPES:-
 * 1.DEFAULT : NO EXPLICIT NEED OF DEFINING JAVA PROVIDES DEFAULT CONSTRUCTOR THAT INITIALIZE ALL VARIABLES TO DEFAULT VALUES.
 * 2. PARAMETERIZED: PARAMETERS PASS VALUE AT THE TIME OF OBJECT CREATION USED TO MANDATE CERTAIN VAR TO INITIALIZE AT TIME OF CREATION
 * -------------------------------------------------------------------
 * Constructor chaining (Concept of polymorphism)*/
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Student(int age) {
        this("Unknown",age);
    }
    Student() {
        this("Unknown",18);
    }

}
class studentTest{
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        Student student1 = new Student(12);
        System.out.println(student1.name);
        System.out.println(student1.age);
        Student student2 = new Student("poppy",13);
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}
// we use .equals() method to compare 2 non primitives == just compare object references (something which is just referring to location not actual data ptr in cpp) , string ,array
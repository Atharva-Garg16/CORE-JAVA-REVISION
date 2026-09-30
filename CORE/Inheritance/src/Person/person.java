package Person;

public class person {
     private String Name;
     private int age;

    public person(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
         if(!(obj instanceof person))
             return false;
         else {
             person person = (person)obj;
             return this.Name.equals(person.Name) && this.age == person.age;
         }
     }

}
class Test{
    static void main() {
        person person = new person("John", 18);
        person person1 = new person("John", 18);
        System.out.println(person.equals(person1));
    }

}

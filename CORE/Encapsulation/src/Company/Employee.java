package Company;

public class Employee {
    private  String name;
    private  int age;
    private  int salary;
    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    void getEmployee(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Age : "+age);
        System.out.println("Employee Salary : "+salary);
    }
}



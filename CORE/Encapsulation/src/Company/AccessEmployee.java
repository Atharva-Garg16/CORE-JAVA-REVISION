package Company;

 class AccessEmployee {
   public static void main(String[] args) {
       Employee employee=new Employee("Golu",25,2_000_000);
       employee.getEmployee();
       employee.setSalary(25_000_000);
       employee.setName("Bholu");
       employee.getEmployee();
   }

}

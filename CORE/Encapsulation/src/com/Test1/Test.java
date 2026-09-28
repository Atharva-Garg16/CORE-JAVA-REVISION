package com.Test1;

public class Test {
   public int age;
   public String name;
   String roll;
   private int account;

    int getAccount() {// default getter yaani bank ka aadmi hi account no. dekh paaye
      return account;
   }
   public void setAge(int age) {
      this.age = age;
   }
// we use getter and setters to restrict direct variable access, as we can't restrict user to modify variable if accessed directly , whereas in method we can impose conditions on it. We can also decide to provide read only , write only or both r&w access
}
class A{

}
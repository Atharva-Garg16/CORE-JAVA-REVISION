import java.util.Scanner;

public class test {
   int k;
   private String name;

   public test(String name) {
      this.name = name;
   }
   void setK(int k) {
      this.k = 78;
   }


}
void main(){
test T1=new test("chitu");
T1.k=5;
T1.setK(T1.k);
System.out.println(T1.k);
int a=10;
System.out.println(a);// ???

System.out.println(T1.name);
//System.out.println(T1.changeName());
//System.out.println(T1.name);
}
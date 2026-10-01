package Compile_time;

public class Method_Overload {
    // this are var args that is methods with variable numbers of arguments
   public static void add(String... ar){
       String result = String.join(" ", ar);
       System.out.println(result);
   }
   public static void add(int... ar){
       int sum = 0;
       for (int i : ar) {
           sum += i;
       }
       System.out.println(sum);
   }

    static void main() {
       add(1,2,3,4);
       add(1,2,3);
       add("Atharva","Garg","is","a","good","person");
       add("Atharva","is","son","of","god");
    }
}

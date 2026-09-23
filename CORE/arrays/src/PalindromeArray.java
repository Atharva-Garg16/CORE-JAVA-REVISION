public class PalindromeArray {
    public static void main(String[] args) {
        int []arr= ArrayUtility.arrayInput();
        boolean b=false;
        for (int i=0;i<arr.length/2;i++){
           if(arr[i]!=arr[arr.length-1-i]){
               b=true;
               break;
           }
        }
      if (b) System.out.println("not a palindrome");
      else System.out.println("palindrome");
    }
}
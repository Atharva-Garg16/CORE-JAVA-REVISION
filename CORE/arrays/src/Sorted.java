public class Sorted {
    public static void main(String[] args) {
       int [] arr= ArrayUtility.arrayInput();
       boolean b=false;
       for (int i=0; i< arr.length-1;i++){
           if (arr[i]>arr[i+1]){
               b=true;
               break;
           }
       }
       if (b){
           System.out.println("not sorted");
       }
       else System.out.println("sorted array");
    }
}

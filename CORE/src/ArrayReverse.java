public class ArrayReverse {
    public static void main(String[] args) {
       int []arr= ArrayUtility.arrayInput();
        for (int i=0;i<arr.length/2;i++){
            int swap=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=swap;
        }
        for (int j=0; j<arr.length;j++ ){
            System.out.print(arr[j] +",");
        }
        System.out.print("\b");
    }
}

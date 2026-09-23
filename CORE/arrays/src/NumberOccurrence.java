import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr =ArrayUtility.arrayInput();
        System.out.println("enter the element you want to find");
        int target= scanner.nextInt();
        int count =0;
        for (int i=0; i< arr.length;i++){
            if (target==arr[i]){
                count++;
            }
        }
        System.out.println(target+" occurred " + count +" times in array");

    }
}

import java.util.Scanner;

public class ArrayUtility {
    public static int[] arrayInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of Array");
        int size= scanner.nextInt();
        int []arr=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("enter the element");
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}

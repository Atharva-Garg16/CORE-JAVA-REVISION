import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);

        try {
            int n=sc.nextInt();
            System.out.println(arr[n]);
        } catch (InputMismatchException e) {
            System.out.println("please enter a integer number");
        }// sabse pahle ye check krega
        // than jump there
        // only one catch block will be executed
//        catch (Throwable t){
//            System.out.println("error");
//        }//Exception 'java.lang.Exception' has already been caught
        catch (Exception e) {
            throw  new RuntimeException();
        }


    }
}

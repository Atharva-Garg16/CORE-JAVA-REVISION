package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsAndThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        if(name.length()<3){
            throw new InputMismatchException("Name is too short");
        }
    }
}

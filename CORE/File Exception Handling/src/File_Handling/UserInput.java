package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    static void main() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name which you want to make");
        String fileName = sc.nextLine();
        try (FileReader fw=new FileReader(fileName)){
            int k;
            while ((k=fw.read())!=-1){
                System.out.print((char)k);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            throw new FileNotFoundException("Nhi hai aisi koi file bc***");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("\nho gyi read ya nhi mili 😂");
        }
    }
}

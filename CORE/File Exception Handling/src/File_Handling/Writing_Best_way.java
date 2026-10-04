package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_Best_way {
    static void main() {
        /// this is called as try with resource ---> try(resource){} in this case it becomes
        /// responsibility of java to close the resource
        try(FileWriter fw = new FileWriter("tableOf16.txt")) {
            for(int i = 1; i <= 10; i++) {
                fw.write("16 X " + i+" = "+ (16*i)+"\n");
            }

        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Any other error occured.");
        }
    }
}

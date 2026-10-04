package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_From_file {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\hp\\IdeaProjects\\CORE-JAVA-REVISION\\tableOf16.txt")) {
            int read=0;
            read=fr.read();
            while((read)!=-1) {
                System.out.print((char)read);
                read=fr.read();

            }
        }catch (IOException e)
            {
            System.out.println("Error in reading file");
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

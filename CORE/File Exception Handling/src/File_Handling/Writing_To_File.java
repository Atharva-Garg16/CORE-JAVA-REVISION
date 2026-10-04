package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_To_File {
    public static void main(String[] args) throws IOException {
      String fileName="example.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Atharva is great");
            fileWriter.flush();
            System.out.println("File written Successfully");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }// if we don't specify path than file will formed inside project folder
        finally {
            fileWriter.close();//Method invocation 'close' may produce 'NullPointerException'
        }

    }
}

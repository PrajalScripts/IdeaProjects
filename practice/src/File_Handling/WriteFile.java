// we use file writer and its method write() to perfrom write operation on the file  .
package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

            try (FileWriter write = new FileWriter("input.txt")) {
                write.write("I am Working IN Xcelore");
                System.out.println("Successfully Written");
            }

        catch (IOException e){
            System.out.println(" an Exception occured cant write in file  ");
        }
    }
}

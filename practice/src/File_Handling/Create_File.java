//Streams
//        In Java, a sequence of data is known as a stream. This concept is used to perform I/O operations on a file. Below are the types of Streams:
//
package File_Handling;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Create_File {
    public static void main(String[] args) {

//        try {
//
//
//            File fi = new File("input.txt");
//            if(file.createNewFile()){
//                System.out.println("File created "+ fi.getName());
//            }
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        Path filePath = Paths.get("sample.txt");

        try {
            Files.write(filePath, "Hello, World!".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("File created/written.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

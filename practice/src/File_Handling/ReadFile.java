package File_Handling;
//introduced after java1.4


import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.stream.Stream;

//  We use FileReader and ITs method Like hasNext() ;
public class ReadFile {
    public static void main(String[] args) {
        String fileName= "input.txt";
        try(Stream<String> stream= Files.lines(Paths.get(fileName))){
         stream.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

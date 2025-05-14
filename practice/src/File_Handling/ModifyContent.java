package File_Handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class ModifyContent {
    public static void main(String[] args) {


        Path filename = Paths.get("input.txt");
        try {
            List<String> updated_lines = Files.readAllLines(filename).stream().map(x->x.replaceAll("Xcelore","Amazon")).collect(Collectors.toList());
            Files.write(filename,updated_lines, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Lines Updated");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

package File_Handling;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            Path filePath= Paths.get("input.txt");
            Files.deleteIfExists(filePath);
            System.out.println("File deleted.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

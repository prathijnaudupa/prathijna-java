import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class Write {
    public static void main(String arg[]) {
 
        String fileContent = "extra line after writing the text";
 
        try {
            Path path = Paths.get("F:\\Java work\\day2\\7 File Handling\\newFile.txt");
            Files.write(path, fileContent.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// write method over writes the previous text in thefile 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
 
public class Creat {
 
    public static void main(String[] args) {
        String content = "This is a new file";
 
        try {
            Files.write(Paths.get("F:\\Java work\\day2\\7 File Handling\\newFile.txt"), content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
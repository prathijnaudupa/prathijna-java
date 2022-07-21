import java.io.File;
import java.util.Scanner;
 
public class Read {
 
    public static void main(String[] args) throws Exception {
 
       
        File file =
                new File("F:\\Java work\\day2\\7 File Handling\\newFile.txt");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
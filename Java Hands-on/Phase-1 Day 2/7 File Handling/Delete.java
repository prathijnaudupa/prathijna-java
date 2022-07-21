import java.io.File;
 
public class Delete {
 
    public static void main(String[] args) {
        //absolute file name with path
        File file = new File("F:\\Java work\\day2\\7 File Handling\\file.txt");
        if(file.delete()){
            System.out.println("File deleted");
        }else System.out.println("File doesn't exists");
    }
}
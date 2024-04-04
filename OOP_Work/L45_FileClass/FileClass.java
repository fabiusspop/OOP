package L45_FileClass;
import java.io.File;

public class FileClass {

    // file = an abstract representation of file and directory pathnames

    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\Fabius S Pop\\Desktop\\secretmessage.txt");

        if(file.exists())
        {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();
        }
        else
        {
            System.out.println("That file doesn't exist!");
        }

    }
}

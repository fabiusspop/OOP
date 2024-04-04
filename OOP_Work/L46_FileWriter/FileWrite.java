package L46_FileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("filewriter.txt");
        writer.write("This is a text");
        writer.close();

    }
}

package L82_Serializationn;
import java.io.*;

public class Deserializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\Fabius S Pop\\Desktop\\BroCode Course 12H\\UserInfo.ser");

        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();



    }
}

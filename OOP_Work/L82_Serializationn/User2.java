package L82_Serializationn;

import java.io.Serializable;

public class User2 implements Serializable {

    String name;
    transient String password;

    public void sayHello()
    {
        System.out.println("Hello " + name);
    }
}

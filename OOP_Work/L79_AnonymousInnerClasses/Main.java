package L79_AnonymousInnerClasses;

public class Main {

    public static void main(String[] args)
    {
        Greeting greeting = new Greeting(){

            @Override
            public void Welcome()
            {
                System.out.println("Hellooooo");
            }
        };

        Greeting greeting2 = new Greeting();
        greeting.Welcome();
        greeting2.Welcome();
    }
}

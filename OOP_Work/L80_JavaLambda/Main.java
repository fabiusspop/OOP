package L80_JavaLambda;

public class Main {

    public static void main (String[] args)
    {
        String name = "FSP";
        char symbol = '!';

        MyInterface myInterface = (n,s) -> {
            System.out.println("Heello World!");
            System.out.println("It is a nice day " + n + s);
        };

        MyInterface myInterface2 = (n,s) -> {
          System.out.println("Hello " + n + s );
        };


        // myInterface.message(name, symbol);
        myInterface2.message(name, symbol);
    }
}

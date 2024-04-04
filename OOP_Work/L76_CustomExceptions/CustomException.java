package L76_CustomExceptions;

import java.util.Scanner;

public class CustomException {

    static void checkAge(int age) throws AgeException
    {
        if (age < 18)
        {
            throw new AgeException(" You must be over 18!");
        }
        else
        {
            System.out.println("Signed up!");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        }
        catch(Exception e)
        {
            System.out.println("Problem occured: " + e);
        }
    }
}

package L81_Genericss;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericClasses {

    public static void main(String[] args)
    {
        /*
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");
         */

        /*
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
        */

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);

        /*
        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
        MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '!');
        */

        // ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        /*
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
        */

        //bounded types : <T extends Number (for example)



    }
}

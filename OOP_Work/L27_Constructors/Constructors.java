package L27_Constructors;

// constructor = special method that is called when an obj is instantiated

public class Constructors {

    public static void main (String[] args)
    {
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }
}

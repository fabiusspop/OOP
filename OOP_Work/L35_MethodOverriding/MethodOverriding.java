package L35_MethodOverriding;

// method overriding = Declaring a method in subclass,
//                      which is already present in parent class.
//                      done so that a child class can give its own implementation

public class MethodOverriding {

    public static void main(String[] args)
    {

        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();

    }
}

package L37_Abstraction;

// abstract = abstract classes cannot be instantiated, but they can have a subclass
//              abstract methods are declared without an implementation

public class Abstraction {

    public static void main(String[] args)
    {

        // Vehicle vehicle = new Vehicle(); ERROR -> we have to pick a certain tipe of vehicle

        Car car = new Car();

        car.go();

    }
}

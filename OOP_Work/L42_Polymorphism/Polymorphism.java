package L42_Polymorphism;

public class Polymorphism {

    // polymorphism = greek word for poly-"many", morph-"form"
    //                  The ability of an object to identify as more than one type

    public static void main(String[] args)
    {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        /*
        car.go();
        bicycle.go();
        boat.go();
         */

        for (Vehicle x : racers)
        {
            x.go();
        }
    }
}

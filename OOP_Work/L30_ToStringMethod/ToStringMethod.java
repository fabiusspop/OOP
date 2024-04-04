package L30_ToStringMethod;

// N O T E
// toString() = special method that all objects inherit
//              that returns a string that "textually represents" an obj.
//              can be used both implicitly and explicitly

public class ToStringMethod {

    public static void main(String[] args)
    {
        Car car = new Car();

        // System.out.println(car); --> address of car object in memory

        // explicitly:
        // System.out.println(car.toString());

        // implicitly:
        System.out.println(car);
    }
}

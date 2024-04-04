package L39_Encapsulation;

public class Encapsulation {

    // Encapsulation = attributes of a class will be hidden or private,
    //                  Can be accessed only through methods (getters & setters)
    //                  You should make attributes private if you don't have a reason to make them public/protected

    public static void main(String[] args)
    {
        Car car = new Car("Chevrolet", "Camarro", 2021);

        // System.out.println(car.make); --> error bc private

        System.out.println(car.getModel());

        // car.year = 2022; --> error --> we need SETTERS

        car.setYear(2022);
        System.out.println(car.getYear());


    }
}

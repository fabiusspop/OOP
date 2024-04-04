package L32_ObjectPassing;

public class ObjectPassing {

    public static void main(String[] args)
    {
        Garage garage = new Garage();

        Car car = new Car("BMW");

        garage.park(car);

        Car car2 = new Car("Tesla");

        garage.park(car2);
    }
}

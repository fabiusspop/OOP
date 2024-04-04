package L30_ToStringMethod;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 1991;

    public String toString() {

        String myString = make + " " + model + " " + color + " " + year + ";";
        return myString;

        // return make + " " + model + " " + color + " " + year + ";";

    }

}

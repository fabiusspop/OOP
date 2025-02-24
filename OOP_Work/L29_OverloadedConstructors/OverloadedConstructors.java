package L29_OverloadedConstructors;

public class OverloadedConstructors {

    // overloaded consturctors = multiple constructors within a class with the same name,
    //                           but have different parameters
    //                           name + parameters = signature

    public static void main (String[] args)
    {
        // Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella");
        // Pizza pizza = new Pizza();

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        // System.out.println(pizza.topping);
    }
}

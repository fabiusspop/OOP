package L36_SuperKeyword;

public class Hero extends Person{

    String power;

    Hero(String name, int age, String power){

        super(name, age);
        // this.name = name;
        // this.age = age;
        this.power = power;

    }

    // super can also be used in methods
    public String toString(){

        return super.toString() + this.power;

    }
}

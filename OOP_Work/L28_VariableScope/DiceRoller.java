package L28_VariableScope;

import java.util.Random;

public class DiceRoller {

    //global declaration
    Random random;
    int number = 0;

    DiceRoller(){

        //local declaration
        /*
        Random random = new Random();
        int number = 0;
        roll(random, number);
        */

        //global
        random = new Random();
        roll();

    }

    void roll(){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}

package L41_Interface;

public class Rabbit implements Prey{

    @Override
    public void flee()
    {
        System.out.println("*The rabbit is fleeing*");
    }
}

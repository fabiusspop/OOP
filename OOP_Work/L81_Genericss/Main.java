package L81_Genericss;

public class Main {

    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);

        System.out.println(getFirst(stringArray));
    }

    public static <Thing> void displayArray(Thing[] array)
    {
        for (Thing x : array)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] array)
    {
        return array[0];
    }

}

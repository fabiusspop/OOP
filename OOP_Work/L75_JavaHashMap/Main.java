package L75_JavaHashMap;
import java.util.HashMap;

public class Main {

    public static void main(String[] args)
    {
        HashMap<String, String> countries = new HashMap<String, String>();

        // add a key and value
        countries.put("USA", "Washington DC");
        countries.put("Germany", "Berlin");
        countries.put("Romania", "Bucharest");
        countries.put("Russia", "Moscow");

        // System.out.println(countries);
        // countries.remove("USA");
        // System.out.println(countries.get("Russia"));
        // countries.clear();
        // System.out.println(countries.size());
        // countries.replace("USA", "Chicago");
        // System.out.println(countries.containsKey("England"));
        // System.out.println(countries.containsValue("Moscow"));

        for (String i : countries.keySet())
        {
            System.out.print(i + " - ");
            System.out.println(countries.get(i));
        }




    }
}

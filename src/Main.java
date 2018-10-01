import java.util.HashMap;
import java.util.Map;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Movie> map = new HashMap<>();

        Movie movie1 = new Movie("Thomas i knibe", 2018, "comedy");
        Movie movie2 = new Movie("Deadpool 2", 2017, "comedy");
        Movie movie3 = new Movie("Borat", 2010, "comedy");
        Movie movie4 = new Movie("The Dictator", 2015, "comedy");

        map.put(100, movie1);
        map.put(101, movie2);
        map.put(102, movie3);
        map.put(103, new Movie("gustav skal ha smæk", 2018, "comedy"));
        //map.put(100, movie4);

        System.out.println("does map contain the String \"Thomas\"?: "+map.containsValue("thomas"));
        System.out.println("does map contain the object \"movie1?\": "+map.containsValue(movie1));
        System.out.println("does map contain anything linked to key 100? : "+map.containsKey(100));
        System.out.println("map.get(100): "+ map.get(100));
        System.out.println("overriding key 100 with movie4");
        map.put(100, movie4);
        System.out.println("map.get(100): "+ map.get(100));
        System.out.println("\nprint the whole map please:\n");
        System.out.println("map size: "+map.size());

        System.out.println(map.values());



        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //System.out.println(map.remove(100));

    }
}

package SWECourseWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args){
        //construction
        ArrayList<String> groceries = new ArrayList<>();

        //adding elements
        groceries.add("Milk");
        groceries.add("eggs");
        groceries.add("bread");

        //accessing elements
        System.out.println(groceries.get(1));

        //changing an element
        groceries.set(2, "bagel");

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Everything Everywhere All at Once");
        movies.add("The Substance");
        movies.add("A Dog's Purpose");
        movies.add("The Barbie Movie");
        movies.add("Regretting You");
        for(String x : movies){
            System.out.println(x);
        }
        System.out.println("---------------------------");
        movies.remove(1);
        for(String x : movies){
            System.out.println(x);
        }
        List moveList = new ArrayList<>(List.of(
                "El Diablo",
                "Fight Club",
                "The sound of music"
        ));

    }
    private static void printArray(List<String> list){
        for(String item: list){
            int index = 1;
            System.out.print("%s ".formatted(item));
        }
    }


}

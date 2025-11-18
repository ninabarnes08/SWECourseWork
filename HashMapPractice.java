package SWECourseWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){ //keys need to be unique in a hashmap
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Cindy", 90);
        System.out.println(grades.get("Cindy"));
        grades.put("Cindy", 80); //overriding the key...you can only have one
        System.out.println(grades.get("Cindy"));
        grades.isEmpty();
        grades.containsKey("Cindy");
        grades.putIfAbsent("Cindy", 95);

        for(Map.Entry<String, Integer> item : grades.entrySet()){
            System.out.println("%s: %d".formatted(item.getKey(), item.getValue()));
        }
//ORDER IS NOT GUARANTEED IN A HASMAP
    }
}

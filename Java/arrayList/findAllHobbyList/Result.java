package arrayList.findAllHobbyList;

import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> map = new HashMap<>();

        map.put("Steve", List.of("Fashion", "Piano", "Reading"));
        map.put("Patty", List.of("Drama", "Magic", "Yoga"));
        map.put("Chad", List.of("Puzzle", "Pets", "Yoga"));

        String hobby = sc.nextLine();

        Set<Map.Entry<String, List<String>>> entrySet = map.entrySet();

        for (Map.Entry<String, List<String>> entry : entrySet){
            List<String> hobbies = entry.getValue();
            if (hobbies.contains(hobby)){
                System.out.println(entry.getKey() + " " + hobby);
            }
        }


    }
}

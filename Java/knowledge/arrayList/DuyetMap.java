package knowledge.arrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuyetMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 2);
        map.put(2, 3);
        map.put(4 ,5);
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry);
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

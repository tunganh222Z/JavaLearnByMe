package HashTable_SetMap.Knowledge;

import java.util.HashSet;
import java.util.Set;

public class HashSetJava {
    public static void main(String[] args) {
        Set<Integer> myIntSet = new HashSet<>();
        //LinkedHashSet và HashSet không đảm bảo thứ tự

        myIntSet.add(1);
        myIntSet.add(22);
        myIntSet.add(1);

        for (Integer num : myIntSet){
            System.out.println(num);
        }
    }
}

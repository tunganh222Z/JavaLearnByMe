package HashTable_SetMap.Knowledge;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2,2,2,2};
        Map<Integer, Integer> myMap = new HashMap<>();
        // key giá trị của phần tử trong mảng
        // value số lần xuất hiện phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            if (myMap.containsKey(arr[i])) {
                myMap.put(arr[i], myMap.get(arr[i])+1);
            } else {
                myMap.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
        }

    }
}

package arrayList.UniqueNumber;

import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i <n; i++){
            if (map.containsKey(a[i])){
                boolean seen = true;

                map.put(a[i], seen);

            } else {
                map.put(a[i], false);
            }
        }

        Set<Map.Entry<Integer, Boolean>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Boolean> entry : entrySet){
            if (entry.getValue() == false){
                System.out.println(entry.getKey());
            }
        }
    }
}

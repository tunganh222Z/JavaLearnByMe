package knowledge.arrayList.bai27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n ; i++){
            a[i] = sc.nextInt();

            if (map.containsKey(a[i])){
                int tanSuat = map.get(a[i]);
                tanSuat++;
                map.put(a[i], tanSuat);
            } else {
                map.put(a[i], 1);
            }
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++){
            if (map.containsKey(a[i])){
                System.out.println(a[i] + " " + map.get(a[i]));
                map.remove(a[i]);
            }
        }
    }
}

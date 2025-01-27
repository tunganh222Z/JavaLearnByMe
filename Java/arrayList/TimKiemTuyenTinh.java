package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TimKiemTuyenTinh {
    public static void main(String[] args) {
        // Duyệt từ đầu đến cuối độ phức tạp O(n)
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        int linearSearch = 1;

        for (int i =0; i < n ; i++){
            if ( arr.get(i) == linearSearch){
                break;
            }
        }
    }
}

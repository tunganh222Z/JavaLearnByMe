package arrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapKnowledege {
    public static void main(String[] args) {
        //Map là container giúp lưu các phần tử theo cặp key, value (khóa - giá trị). mỗi giá trị của key sẽ ánh xạ sang một value tương ứng.
        // so với Set thì Map thậm chí còn mạnh mẽ và giải quyết được nhiều vấn đề hơn.
        /*
        Tính chất
        Các key trong map là những giá trị unique, không có 2 key nào có giá trị giống nhau, value có thể trùng nhau
        Map có thể tìm kiếm nhanh
        Map có thể dùng key làm index để truy cập value tương ứng
        Map trong java chỉ lưu các phần tử là object
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        //HashMap - > Không có thứ tự
        Map<Integer, Integer> hashMap = new HashMap<>();

        Map<String, Integer> map ;

        hashMap.put(1, 5); // (1,2)
        hashMap.put(2, 6); // (1,2), (2,6)
        hashMap.put(4, 5); // (1,2), (2,6), (4,5)
        hashMap.put(2, 10); // (1,2), (2,6 -> thay 6 = 10), (4,5)

        System.out.println(hashMap.size());
        System.out.println(hashMap.get(2));
        System.out.println(hashMap);

        // Vd tần xuất xuất hiện của các giá trị trong mảng

        System.out.println("Tan suat");
       tanSuatXuatHien(a, n);

        System.out.println("====== entry set =========");
       //Lấy ra entry của map, trả về 1 cái tập hợp chưa các phần từ trong map
        Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet){
            System.out.println(entry);
        }

    }

    public static void tanSuatXuatHien(int[] a, int n){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n ; i++){
            if (hashMap.containsKey(a[i])){
                int tansuat = hashMap.get(a[i]);
                tansuat++;
                hashMap.put(a[i], tansuat);
            } else {
                hashMap.put(a[i], 1);
            }
        }
        System.out.println(hashMap);
    }
}

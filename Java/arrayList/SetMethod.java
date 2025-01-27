package arrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethod {
    public static void main(String[] args) {
        // Có 3 lớp Set
        // HashSet  - LinkedHashSet - TreeSet
        // Set là container mà trong đó mỗi phần tử là duy nhất không giống nhau unique

        //HashSet lưu đc các phần tử khác nhau, được cài đặt bằng bảng băm tốc độ tìm kiếm O(1)
        //HashSet không có thứ tự (add 100 200 300 400 có thể in ra 400 200 100 300) , chỉ lưu đc các phần tử kiểu đối tượng reference
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(100); // không lưu vào vì có 100 rồi

        int[] a = {1,2,3,4,5,6,7,1,2,3,4};

        for (int x : a){
            hashSet.add(x);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.size()); // => in ra số lượng các phần tử khác nhau của mảng a
        hashSet.remove(3); // nếu trong set có 3 thì sẽ remove 3; nếu không có sẽ gây lỗi ab

        //LinkedHashSet chỉ lưu được các phần tử khác nhau. được cài đặt bảng băm tốc độ tìm kiếm o(1)
        // LinkedHashSet khác thằng HashSet là lưu theo thứ tự xuất hiện (add 100 200 500 600 700 vẫn in ra thứ tự như vậy)
        int[] b = {1,2,4,6,7,4,5,3};

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int x : b) {
            linkedHashSet.add(x);
        }
        System.out.println(linkedHashSet);

        //TreeSet chỉ lưu được các phần tử khác nhau, đc cài đặt bằng cây đỏ đen Red Black tree, các hàm tìm kiếm xóa của tree là LogN
        // TreeSet có thứ tự tăng dần
        // TreeSet chỉ lưu đc các phần tử kiểu đối tượng

        TreeSet<Integer> treeSet = new TreeSet<>();

        int[] c = {2,1,5,5,1,6,8,89,1,2,3,4,5,7,8};

        for (int x  : c ){
            treeSet.add(x);
        }

        System.out.println(treeSet);
    }
}

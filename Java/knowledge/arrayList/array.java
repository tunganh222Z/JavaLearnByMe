package knowledge.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //List là lớp cha của ArrayList

        int n =sc.nextInt();

        //Type <> phải là dạng Integer Long Double Float -> đây là dạng wrapper reference, kiểu primitive không đuọc
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println(arr.size());

        for (int  i = 0 ; i < n; i++){
            int temp = sc.nextInt();
            arr.add(temp);
        }

        for (int x : arr){
            System.out.print(x + " ");
        }

        // Thay thế index tại vị trí n thành một giá trị khác
        arr.set(2, 100); // thay đổi phần tử index = 2 thành 100

        // remove với index
        arr.remove(3); // xóa index 3

        arr.remove((Object) 1); // xóa thằng value = 1; phải ép sang kiểu object

        //indexOf; arr = {1,2,3,2,2,}
        arr.indexOf(2); // out : 1
        arr.indexOf(100); // -1 nếu trong mảng k có 100;

        // toArray trả về 1 mảng Object
        //sort
        Collections.sort(arr);
        Collections.reverse(arr);

    }
}

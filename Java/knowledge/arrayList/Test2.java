package knowledge.arrayList;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Số lượng danh bạ
        sc.nextLine(); // Bỏ qua dòng trống

        // Khởi tạo HashMap
        HashMap<String, String> phoneBook = new HashMap<>();

        // Nhập danh bạ
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String phoneNumber = sc.next();
            phoneBook.put(name, phoneNumber);
        }

        // Xử lý các query
            String query = sc.next();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }

    }
}

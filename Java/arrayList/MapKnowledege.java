package arrayList;

import java.util.HashMap;

public class Map {
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

        //HashMap - > Không có thứ tự
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    }
}

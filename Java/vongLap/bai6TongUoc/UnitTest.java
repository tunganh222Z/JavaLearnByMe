package vongLap.bai6TongUoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    public void testTinhTongUoc() {
        // Các trường hợp kiểm tra với các giá trị cụ thể
        assertEquals(56, TongUoc.tinhTongUoc(28)); // Các ước của 28 là 1, 2, 4, 7, 14, 28 => tổng = 56
        assertEquals(1, TongUoc.tinhTongUoc(1));   // ước duy nhất là 1
        assertEquals(3, TongUoc.tinhTongUoc(2));   // Các ước của 2 là 1, 2 => tổng = 3
        assertEquals(7, TongUoc.tinhTongUoc(4));   // Các ước của 4 là 1, 2, 4 => tổng = 7
        assertEquals(15, TongUoc.tinhTongUoc(8));  // Các ước của 8 là 1, 2, 4, 8 => tổng = 15
    }
}

package knowledge.vongLap.bai6TongUoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    TongUoc tongUoc  = new TongUoc();

    @Test
    public void testTinhTongUoc() {

        assertEquals(56, tongUoc.tinhTongUoc(28)); // Các ước của 28 là 1, 2, 4, 7, 14, 28 => tổng = 56
        assertEquals(1, tongUoc.tinhTongUoc(1));   // ước duy nhất là 1
        assertEquals(3, tongUoc.tinhTongUoc(2));   // Các ước của 2 là 1, 2 => tổng = 3
        assertEquals(7, tongUoc.tinhTongUoc(4));   // Các ước của 4 là 1, 2, 4 => tổng = 7
        assertEquals(15, tongUoc.tinhTongUoc(8));  // Các ước của 8 là 1, 2, 4, 8 => tổng = 15
    }
}

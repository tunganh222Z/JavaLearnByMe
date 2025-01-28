package knowledge.vongLap.bai7LietKeUoc;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UnitTest {
    @Test
    public void TC_01_SO_NGUYEN_DUONG(){
        int input = 28;
        List<Integer> tc01 = new ArrayList<>(List.of(1, 2, 4, 7, 14, 28));
        int size = tc01.size();

        Assert.assertEquals(tc01, LietKeUoc.lietKeUoc(input));

        Assert.assertEquals(size, LietKeUoc.soLuongUoc(input));
    }

    @Test
    public void TC_02_INPUT_SO_NGUYEN_TO(){
        int input = 7;
        List<Integer> tc01 = new ArrayList<>(List.of(1, 7));
        int size = tc01.size();

        Assert.assertEquals(tc01, LietKeUoc.lietKeUoc(input));

        Assert.assertEquals(size, LietKeUoc.soLuongUoc(input));

    }


    @Test
    public void TC_03_INPUT_EQUAL_1(){
        int input = 1;
        List<Integer> tc01 = new ArrayList<>(List.of(1));
        int size = tc01.size();

        Assert.assertEquals(tc01, LietKeUoc.lietKeUoc(input));

        Assert.assertEquals(size, LietKeUoc.soLuongUoc(input));

    }

}

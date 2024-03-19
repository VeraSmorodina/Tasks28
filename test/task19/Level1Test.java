package task19;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void shopOLAP1() {
        String[] assertedResult = new String[]{"платье1 6", "сумка128 4", "сумка23 2", "сумка32 2"};
        String[] result = Level1.ShopOLAP(5, new String[]{"платье1 5", "сумка32 2", "платье1 1", "сумка23 2", "сумка128 4"});
        assertArrayEquals(assertedResult, result);
    }

    @Test
    public void shopOLAP2() {
        String[] assertedResult = new String[]{"сумка32 7", "платье1 6", "сумка128 4", "сумка23 2"};
        String[] result = Level1.ShopOLAP(6, new String[]{"платье1 5", "сумка32 2", "сумка32 5", "платье1 1", "сумка23 2", "сумка128 4"});
        assertArrayEquals(assertedResult, result);
    }

    @Test
    public void shopOLAP3() {
        String[] assertedResult = new String[]{"платье1 6", "сумка32 6", "сумка128 4", "сумка23 2"};
        String[] result = Level1.ShopOLAP(6, new String[]{"платье1 5", "сумка32 2", "сумка32 4", "платье1 1", "сумка23 2", "сумка128 4"});
        assertArrayEquals(assertedResult, result);
    }


}
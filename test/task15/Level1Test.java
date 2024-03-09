package task15;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void tankRush1() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 4, "1234 2345 0987", 2, 2, "34 98");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush2() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(2, 2, "12 34", 2, 2, "12 34");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush3() {
        boolean assertedResult = false;
        boolean result = Level1.TankRush(2, 2, "12 34", 2, 2, "34 12");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush4() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 2, "12 34 12", 2, 2, "34 12");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush5() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 2, "12 34 19", 2, 2, "12 34");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush6() {
        boolean assertedResult = false;
        boolean result = Level1.TankRush(3, 3, "123 346 198", 2, 3, "123 198");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush7() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(4, 6, "029402 560202 029694 780288", 2, 2, "02 94");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush8() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 3, "123 236 348", 3, 2, "23 34");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush9() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 3, "123 234 348", 2, 2, "23 34");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush10() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 3, "123 234 348", 3, 3, "123 234 348");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush11() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(5, 15, "000000000000000 000000000000000 000000100000000 000000000000000 000000000000000", 3, 5, "00000 00000 00001");
        assertEquals(assertedResult, result);
    }
}
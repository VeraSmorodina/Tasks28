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
    @Test
    public void tankRush12() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(15, 15, "900934352126360 119214144058652 979486082875698 322436531185165 887105930987956 232802644488782 302771989566798 073573207654780 311755785362806 909007939272309 395094805516080 562910805349811 993854324744973 768703404219199 630625270887199",
                2, 2, "99 99");
        assertEquals(assertedResult, result);
    }

    @Test
    public void tankRush13() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(4, 4, "3434 2234 3348", 2, 2, "34 48");
        assertEquals(assertedResult, result);
    }
}
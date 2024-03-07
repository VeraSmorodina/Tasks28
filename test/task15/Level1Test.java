package task15;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void tankRush1() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 4, "1234 2345 0987", 2, 2, "34 98");
        assert assertedResult == result;
    }
    @Test
    public void tankRush2() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(2, 2, "12 34", 2, 2, "12 34");
        assert assertedResult == result;
    }

    @Test
    public void tankRush3() {
        boolean assertedResult = false;
        boolean result = Level1.TankRush(2, 2, "12 34", 2, 2, "34 12");
        assert assertedResult == result;
    }

    @Test
    public void tankRush4() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 2, "12 34 12", 2, 2, "34 12");
        assert assertedResult == result;
    }

    @Test
    public void tankRush5() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 2, "12 34 19", 2, 2, "12 34");
        assert assertedResult == result;
    }

    @Test
    public void tankRush6() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(3, 3, "123 346 198", 2, 3, "123 198");
        assert assertedResult == result;
    }
    @Test
    public void tankRush7() {
        boolean assertedResult = true;
        boolean result = Level1.TankRush(4, 6, "029402 560202 029694 780288", 2, 2, "02 94");
        assert assertedResult == result;
    }
}
package task16;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void maximumDiscount1() {
        int assertedResult = 450;
        int result = Level1.MaximumDiscount(7, new int[]{400, 350, 300, 250, 200, 150, 100});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount2() {
        int assertedResult = 300;
        int result = Level1.MaximumDiscount(3, new int[]{400, 350, 300});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount3() {
        int assertedResult = 300;
        int result = Level1.MaximumDiscount(3, new int[]{300, 350, 400});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount4() {
        int assertedResult = 100;
        int result = Level1.MaximumDiscount(4, new int[]{200, 100, 100, 100});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount5() {
        int assertedResult = 150;
        int result = Level1.MaximumDiscount(7, new int[]{200, 100, 100, 100, 50, 50, 50});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount6() {
        int assertedResult = 150;
        int result = Level1.MaximumDiscount(6, new int[]{200, 100, 100, 100, 50, 50});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount7() {
        int assertedResult = 160;
        int result = Level1.MaximumDiscount(9, new int[]{200, 100, 100, 100, 50, 50, 10, 10, 10});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount8() {
        int assertedResult = 160;
        int result = Level1.MaximumDiscount(10, new int[]{200, 100, 100, 100, 50, 50, 10, 10, 10, 5});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount9() {
        int assertedResult = 0;
        int result = Level1.MaximumDiscount(2, new int[]{100, 150});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount10() {
        int assertedResult = 150;
        int result = Level1.MaximumDiscount(4, new int[]{100, 150, 200, 250});
        assert assertedResult == result;
    }

    @Test
    public void maximumDiscount11() {
        int assertedResult = 200;
        int result = Level1.MaximumDiscount(5, new int[]{100, 150, 200, 250, 350});
        assert assertedResult == result;
    }


}
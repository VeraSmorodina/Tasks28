package task18;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void misterRobot1() {
        boolean assertedResult = true;
        boolean result = Level1.MisterRobot(7, new int[]{1, 3, 4, 5, 6, 2, 7});
        assert assertedResult == result;
    }

    @Test
    public void misterRobot2() {
        boolean assertedResult = false;
        boolean result = Level1.MisterRobot(5, new int[]{1, 3, 5, 4, 2});
        assert assertedResult == result;
    }

    @Test
    public void misterRobot3() {
        boolean assertedResult = false;
        boolean result = Level1.MisterRobot(10, new int[]{1, 3, 5, 4, 2, 6, 8, 7, 9, 10});
        assert assertedResult == result;
    }

    @Test
    public void misterRobot4() {
        boolean assertedResult = false;
        boolean result = Level1.MisterRobot(5, new int[]{1, 3, 5, 2, 4});
        assert assertedResult == result;
    }

    @Test
    public void misterRobot5() {
        boolean assertedResult = true;
        boolean result = Level1.MisterRobot(5, new int[]{1, 2, 3, 4, 5});
        assert assertedResult == result;
    }

    @Test
    public void misterRobot6() {
        boolean assertedResult = false;
        boolean result = Level1.MisterRobot(5, new int[]{1, 3, 2, 4, 5});
        assert assertedResult == result;
    }

    @Test
    public void misterRobot7() {
        boolean assertedResult = true;
        boolean result = Level1.MisterRobot(5, new int[]{1, 5, 2, 4, 3});
        assert assertedResult == result;
    }

    @Test
    public void misterRobot8() {
        boolean assertedResult = true;
        boolean result = Level1.MisterRobot(10, new int[]{1, 5, 2, 4, 3, 7, 8, 6, 9, 10});
        assert assertedResult == result;
    }
}
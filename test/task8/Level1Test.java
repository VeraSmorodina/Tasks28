package task8;

import org.junit.Test;

public class Level1Test {
    @Test
    public void wordSearch() {
        int expectedResult = 2;
        int result = Level1.SumOfThe(2, new int[]{2, 2});
        assert expectedResult == result;
    }

    @Test
    public void wordSearch2() {
        int expectedResult = 5;
        int result = Level1.SumOfThe(3, new int[]{5, 2, 3});
        assert expectedResult == result;
    }

    @Test
    public void wordSearch3() {
        int expectedResult = -4;
        int result = Level1.SumOfThe(3, new int[]{-1, -5, 2, -4});
        assert expectedResult == result;
    }

    @Test
    public void wordSearch4() {
        int expectedResult = 90;
        int result = Level1.SumOfThe(7, new int[]{100, -50, 10, -25, 90, -35, 90});
        assert expectedResult == result;
    }

}

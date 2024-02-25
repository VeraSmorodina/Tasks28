package task12;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void massVote1() {
        String expectedResult = "majority winner 1";
        String result = Level1.MassVote(5, new int[]{60, 10, 10, 15, 5});
        assert expectedResult.equals(result);
    }

    @Test
    public void massVote2() {
        String expectedResult = "majority winner 5";
        String result = Level1.MassVote(5, new int[]{10, 10, 10, 15, 75});
        assert expectedResult.equals(result);
    }

    @Test
    public void massVote3() {
        String expectedResult = "minority winner 2";
        String result = Level1.MassVote(3, new int[]{10, 15, 10});
        assert expectedResult.equals(result);
    }

    @Test
    public void massVote4() {
        String expectedResult = "no winner";
        String result = Level1.MassVote(4, new int[]{110, 110, 111, 111});
        assert expectedResult.equals(result);
    }

    @Test
    public void massVote5() {
        String expectedResult = "no winner";
        String result = Level1.MassVote(2, new int[]{5, 5});
        assert expectedResult.equals(result);
    }

    @Test
    public void massVote6() {
        String expectedResult = "majority winner 2";
        String result = Level1.MassVote(2, new int[]{1, 5});
        assert expectedResult.equals(result);
    }

    @Test
    public void massVote7() {
        String expectedResult = "majority winner 1";
        String result = Level1.MassVote(1, new int[]{1});
        assert expectedResult.equals(result);
    }

    @Test
    public void massVote8() {
        String expectedResult = "minority winner 1";
        String result = Level1.MassVote(1, new int[]{5, 4, 1});
        assert expectedResult.equals(result);
    }
}
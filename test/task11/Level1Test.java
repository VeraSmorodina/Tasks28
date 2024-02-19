package task11;

import org.junit.Test;


public class Level1Test {
    @Test
    public void bigMinus1() {
        String expectedResult = "2";
        String result = Level1.BigMinus("5", "3");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus2() {
        String expectedResult = "2";
        String result = Level1.BigMinus("21", "19");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus3() {
        String expectedResult = "94";
        String result = Level1.BigMinus("1213", "1119");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus4() {
        String expectedResult = "0";
        String result = Level1.BigMinus("1213", "1213");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus5() {
        String expectedResult = "14";
        String result = Level1.BigMinus("29", "15");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus6() {
        String expectedResult = "14";
        String result = Level1.BigMinus("15", "29");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus7() {
        String expectedResult = "85";
        String result = Level1.BigMinus("15", "100");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus8() {
        String expectedResult = "320";
        String result = Level1.BigMinus("1", "321");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus9() {
        String expectedResult = "321";
        String result = Level1.BigMinus("0", "321");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus10() {
        String expectedResult = "321";
        String result = Level1.BigMinus("321", "0");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus11() {
        String expectedResult = "1234567890";
        String result = Level1.BigMinus("1234567891", "1");
        assert expectedResult.equals(result);
    }

    @Test
    public void bigMinus12() {
        String expectedResult = "1";
        String result = Level1.BigMinus("0", "1");
        assert expectedResult.equals(result);
    }


}
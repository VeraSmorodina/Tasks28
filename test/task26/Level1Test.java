package task26;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void white_walkers1() {
        boolean result = Level2.white_walkers("axxb6===4xaf5===eee5");
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void white_walkers2() {
        boolean result = Level2.white_walkers("5==ooooooo=5=5");
        boolean expected = false;
        assert result == expected;
    }

    @Test
    public void white_walkers3() {
        boolean result = Level2.white_walkers("abc=7==hdjs=3gg1=======5");
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void white_walkers4() {
        boolean result = Level2.white_walkers("aaS=8");
        boolean expected = false;
        assert result == expected;
    }

    @Test
    public void white_walkers5() {
        boolean result = Level2.white_walkers("9===1===9===1===9");
        boolean expected = true;
        assert result == expected;
    }
}
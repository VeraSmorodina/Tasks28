package task27;

import org.junit.Test;

public class Level1Test {
    @Test
    public void football1() {
        boolean result = Level1.Football(new int[]{1, 3, 2}, 3);
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void football2() {
        boolean result = Level1.Football(new int[]{1, 7, 5, 3, 9}, 5);
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void football3() {
        boolean result = Level1.Football(new int[]{3, 2, 1}, 3);
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void football4() {
        boolean result = Level1.Football(new int[]{1, 4, 3, 2, 5}, 5);
        boolean expected = true;
        assert result == expected;
    }

    @Test
    public void football5() {
        boolean result = Level1.Football(new int[]{9, 5, 3, 7, 1}, 5);
        boolean expected = false;
        assert result == expected;
    }

}
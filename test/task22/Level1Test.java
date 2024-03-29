package task22;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void sherlockValidString1() {
        boolean result = Level1.SherlockValidString("xyz");
        boolean asserted = true;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString2() {
        boolean result = Level1.SherlockValidString("aazxy");
        boolean asserted = true;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString3() {
        boolean result = Level1.SherlockValidString("xxyyz");
        boolean asserted = true;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString4() {
        boolean result = Level1.SherlockValidString("zzzxy");
        boolean asserted = false;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString5() {
        boolean result = Level1.SherlockValidString("xxyyza");
        boolean asserted = false;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString6() {
        boolean result = Level1.SherlockValidString("xxxyyyz");
        boolean asserted = true;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString7() {
        boolean result = Level1.SherlockValidString("zxxxyyy");
        boolean asserted = true;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString8() {
        boolean result = Level1.SherlockValidString("xxyyzabc");
        boolean asserted = false;
        assert result == asserted;
    }

    @Test
    public void sherlockValidString9() {
        boolean result = Level1.SherlockValidString("xxxxxyyyyyyy");
        boolean asserted = false;
        assert result == asserted;
    }
}
package task28;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void keymaker1() {
        String result = Level1.Keymaker(1);
        String expected = "1";
        assert result.equals(expected);
    }

    @Test
    public void keymaker2() {
        String result = Level1.Keymaker(2);
        String expected = "10";
        assert result.equals(expected);
    }

    @Test
    public void keymaker3() {
        String result = Level1.Keymaker(3);
        String expected = "100";
        assert result.equals(expected);
    }

    @Test
    public void keymaker4() {
        String result = Level1.Keymaker(4);
        String expected = "1001";
        assert result.equals(expected);
    }

    @Test
    public void keymaker5() {
        String result = Level1.Keymaker(5);
        String expected = "10010";
        assert result.equals(expected);
    }

    @Test
    public void keymaker6() {
        String result = Level1.Keymaker(6);
        String expected = "100100";
        assert result.equals(expected);
    }

    @Test
    public void keymaker7() {
        String result = Level1.Keymaker(7);
        String expected = "1001000";
        assert result.equals(expected);
    }

    @Test
    public void keymaker8() {
        String result = Level1.Keymaker(8);
        String expected = "10010000";
        assert result.equals(expected);
    }

    @Test
    public void keymaker9() {
        String result = Level1.Keymaker(9);
        String expected = "100100001";
        assert result.equals(expected);
    }

    @Test
    public void keymaker10() {
        String result = Level1.Keymaker(10);
        String expected = "1001000010";
        assert result.equals(expected);
    }

    @Test
    public void keymaker15() {
        String result = Level1.Keymaker(15);
        String expected = "100100001000000";
        assert result.equals(expected);
    }

    @Test
    public void keymaker16() {
        String result = Level1.Keymaker(16);
        String expected = "1001000010000001";
        assert result.equals(expected);
    }

    @Test
    public void keymaker24() {
        String result = Level1.Keymaker(24);
        String expected = "100100001000000100000000";
        assert result.equals(expected);
    }

    @Test
    public void keymaker25() {
        String result = Level1.Keymaker(25);
        String expected = "1001000010000001000000001";
        assert result.equals(expected);
    }
}
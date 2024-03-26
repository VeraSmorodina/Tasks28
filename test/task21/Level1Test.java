package task21;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void biggerGreater() {
        String result = Level1.BiggerGreater("вибк");
        String asserted = "викб";
        assert result.equals(asserted);
    }

    @Test
    public void biggerGreater2() {
        String result = Level1.BiggerGreater("fff");
        String asserted = "";
        assert result.equals(asserted);
    }

    @Test
    public void biggerGreater3() {
        String result = Level1.BiggerGreater("ая");
        String asserted = "яа";
        assert result.equals(asserted);
    }

    @Test
    public void biggerGreater4() {
        String result = Level1.BiggerGreater("вкиб");
        String asserted = "ибвк";
        assert result.equals(asserted);
    }

    @Test
    public void biggerGreater5() {
        String result = Level1.BiggerGreater("za");
        String asserted = "";
        assert result.equals(asserted);
    }


}
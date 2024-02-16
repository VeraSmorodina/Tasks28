package task9;

import org.junit.Test;

import java.util.Objects;

public class Level1Test {
    @Test
    public void theRabbitsFootExample1Encode() {
        String phrase = "abcd efgh ijkl";
        String result = "aei bfj cgk dhl";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, true), result);
    }

    @Test
    public void theRabbitsFootExample1Decode() {
        String result = "abcdefghijkl";
        String phrase = "aei bfj cgk dhl";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, false), result);
    }

    @Test
    public void theRabbitsFootExample2Encode() {
        String phrase = "abcd efgh ij";
        String result = "aei bfj cg dh";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, true), result);
    }

    @Test
    public void theRabbitsFootExample2Decode() {
        String result = "abcdefghij";
        String phrase = "aei bfj cg dh";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, false), result);
    }

    @Test
    public void theRabbitsFootExample3Encode() {
        String phrase = "abcd efgh ijnnm";
        String result = "aeim bfj cgn dhn";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, true), result);
    }

    @Test
    public void theRabbitsFootExample3Decode() {
        String result = "abcdefghijnnm";
        String phrase = "aeim bfj cgn dhn";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, false), result);
    }

    @Test
    public void theRabbitsFootExample4Encode() {
        String phrase = "abcd";
        String result = "ac bd";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, true), result);
    }

    @Test
    public void theRabbitsFootExample4Decode() {
        String result = "abcd";
        String phrase = "ac bd";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, false), result);
    }

    @Test
    public void theRabbitsFootExample5Encode() {
        String phrase = "отдай мою кроличью лапку";
        String result = "омоюу толл дюиа акчп йрьк";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, true), result);
    }

    @Test
    public void theRabbitsFootExample5Decode() {
        String result = "отдаймоюкроличьюлапку";
        String phrase = "омоюу толл дюиа акчп йрьк";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, false), result);
    }

    @Test
    public void theRabbitsFootExample6() {
        String phrase = "д";
        String result = "д";
        assert Objects.equals(Level1.TheRabbitsFoot(phrase, true), result);
    }

}

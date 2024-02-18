package task10;

import org.junit.Test;

public class Level1Test {
    @Test
    public void printingCostsAAA() {
        String Line = "AAA";
        int result = 72;
        assert Level1.PrintingCosts(Line) == result;
    }

    @Test
    public void printingCostsA() {
        String Line = "A";
        int result = 24;
        assert Level1.PrintingCosts(Line) == result;
    }

    @Test
    public void printingCostsAnotherSymbol() {
        String Line = "№";
        int result = 23;
        assert Level1.PrintingCosts(Line) == result;
    }

    @Test
    public void printingCostsAnotherPhrase() {
        String Line = "A'\\";
        int result = 37;
        assert Level1.PrintingCosts(Line) == result;
    }

}

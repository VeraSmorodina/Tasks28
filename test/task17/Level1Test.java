package task17;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void lineAnalysis1() {
        boolean assertedResult = true;
        boolean result = Level1.LineAnalysis("*..*..*..*..*..*..*");
        assert assertedResult == result;
    }

    @Test
    public void lineAnalysis2() {
        boolean assertedResult = false;
        boolean result = Level1.LineAnalysis("*..*..*..*..*..**..*");
        assert assertedResult == result;
    }

    @Test
    public void lineAnalysis3() {
        boolean assertedResult = true;
        boolean result = Level1.LineAnalysis("*");
        assert assertedResult == result;
    }
    @Test
    public void lineAnalysis4() {
        boolean assertedResult = true;
        boolean result = Level1.LineAnalysis("***");
        assert assertedResult == result;
    }

    @Test
    public void lineAnalysis5() {
        boolean assertedResult = true;
        boolean result = Level1.LineAnalysis("*.......*.......*");
        assert assertedResult == result;
    }

    @Test
    public void lineAnalysis6() {
        boolean assertedResult = true;
        boolean result = Level1.LineAnalysis("**");
        assert assertedResult == result;
    }

    @Test
    public void lineAnalysis7() {
        boolean assertedResult = true;
        boolean result = Level1.LineAnalysis("*.*");
        assert assertedResult == result;
    }

    @Test
    public void lineAnalysis8() {
        boolean assertedResult = false;
        boolean result = Level1.LineAnalysis("*..*..*..*..*..**..*");
        assert assertedResult == result;
    }
    @Test
    public void lineAnalysis9() {
        boolean assertedResult = false;
        boolean result = Level1.LineAnalysis("*..*...*..*..*..*..*");
        assert assertedResult == result;
    }


}
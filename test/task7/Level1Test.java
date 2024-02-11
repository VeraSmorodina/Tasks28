package task7;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
public class Level1Test {
    @Test
    public void test1() {
        String s = "Я сразу смазал карту будня, плеснувши краску из стакана;";
        int[] array = Level1.WordSearch(9, s, "из");
        assertArrayEquals(new int[]{0,0, 0, 0, 0, 1, 0}, array);
    }
    @Test
    public void test2() {
        String s = "строка разбивается на набор строк через выравнивание по заданной ширине.";
        int[] array = Level1.WordSearch(12, s, "строк");
        assertArrayEquals(new int[]{0, 0, 0, 1, 0, 0, 0}, array);
    }


    @Test
    public void wordSearch() {
        int[] expectedResult = new int[]{0, 0, 1, 0, 0};
        int[] result = Level1.WordSearch(2, "AAAA CC BBB", "CC");
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void wordSearch2() {
        int[] expectedResult = new int[]{0, 0, 0, 1, 0, 0, 0};
        int[] result = Level1.WordSearch(12, "строка разбивается на набор строк через выравнивание по заданной ширине.", "строк");
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void wordSearch3() {
        int[] expectedResult = new int[]{1, 0};
        int[] result = Level1.WordSearch(3, "12345", "123");
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void wordSearch4() {
        int[] expectedResult = new int[]{0, 1};
        int[] result = Level1.WordSearch(3, "12345", "45");
        assertArrayEquals(expectedResult, result);
    }

}
//На чешуе жестяной рыбы прочёл я зовы новых губ.  я показал на блюде студня косые скулы океана.

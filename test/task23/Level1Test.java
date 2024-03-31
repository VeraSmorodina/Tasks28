package task23;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void treeOfLife1() {
        String[] result = Level1.TreeOfLife(2, 4, 2, new String[]{".+..", "..+."});
        String[] expected = new String[]{"...+", "+..."};
        assertArrayEquals(expected, result);
    }

    @Test
    public void treeOfLife2() {
        String[] result = Level1.TreeOfLife(3, 4, 12, new String[]{".+..", "..+.", ".+.."});
        String[] expected = new String[]{".+..", "..+.", ".+.."};
        assertArrayEquals(expected, result);
    }

    @Test
    public void treeOfLife3() {
        String[] result = Level1.TreeOfLife(3, 4, 4, new String[]{".+..", "..+.", ".+.."});
        String[] expected = new String[]{".+..", "..+.", ".+.."};
        assertArrayEquals(expected, result);
    }

    @Test
    public void treeOfLife4() {
        String[] result = Level1.TreeOfLife(2, 2, 2, new String[]{"+.", ".."});
        String[] expected = new String[]{"..", ".+"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void treeOfLife5() {
        String[] result = Level1.TreeOfLife(2, 2, 3, new String[]{"++", "++"});
        String[] expected = new String[]{"++", "++"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void treeOfLife6() {
        String[] result = Level1.TreeOfLife(6, 7, 24, new String[]{
                ".......", "...+...", "....+..", ".......", "++.....", "++....."});
        String[] expected = new String[]{".......", "...+...", "....+..", ".......", "++.....", "++....."};
        assertArrayEquals(expected, result);
    }
}
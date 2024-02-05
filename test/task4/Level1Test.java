package task4;

import org.junit.Test;
import static org.junit.Assert.*;
public class Level1Test {
    @Test
    public void test1() {
        int[] array = Level1.MadMax(7, new int[]{1, 2, 3, 4, 5, 6, 7});
        int[] result = {1, 2, 3, 7, 6, 5, 4};
        assertArrayEquals(result, array);
    }
    @Test
    public void test2() {
        int[] array = Level1.MadMax(7, new int[]{3, 2, 1, 4, 7, 6, 5});
        int[] result = {1, 2, 3, 7, 6, 5, 4};
        assertArrayEquals(result, array);
    }
    @Test
    public void test3() {
        int[] array = Level1.MadMax(9, new int[]{0, 3, 2, 1, 4, 7, 8, 6, 5});
        int[] result = {0, 1, 2, 3, 8, 7, 6, 5, 4};
        assertArrayEquals(result, array);
    }


}

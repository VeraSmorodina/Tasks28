package task5;

import org.junit.Test;
import static org.junit.Assert.*;
public class Level1Test {
    @Test
    public void test1() {
        int[] array1 = {50, 1, 1024};
        int[] array2 = {20000, 100000, 90000};
        assertArrayEquals(new int[]{90000, 20000, 100000}, Level1.SynchronizingTables(3, array1, array2));
    }
    @Test
    public void test2() {
        int[] array1 = {2, 50, 1, 1024};
        int[] array2 = {20000, 100000, 90000, 30000};
        assertArrayEquals(new int[]{30000, 90000, 20000, 100000}, Level1.SynchronizingTables(3, array1, array2));
    }
    @Test
    public void test3() {
        int[] array1 = {3, 2, 50, 1, 1024};
        int[] array2 = {30000, 20000, 100000, 90000, 30000};
        assertArrayEquals(new int[]{30000, 30000, 90000, 20000, 100000}, Level1.SynchronizingTables(3, array1, array2));
    }





}

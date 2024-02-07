package task6;

import org.junit.Test;
import task6.Level1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Level1Test {
    @Test
    public void test1() {
        String a = Level1.PatternUnlock(10, new int[]{1,2,3,4,5,6,2,7,8,9});
        assertEquals( "" + 982843, a);
    }
    @Test
    public void test2() {
        String a = Level1.PatternUnlock(3, new int[]{1,2,3});
        assertEquals( "" + 2, a);
    }


}

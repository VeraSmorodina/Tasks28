package task3;

import org.junit.Test;
import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void test1ConquestCampaign() {
      int[] array = {2, 2, 3, 4};
      int result = Level1.ConquestCampaign(3, 4, 2, array);
      assertEquals(3, result);
    }
    @Test
    public void test2ConquestCampaign() {
        int[] array = {2, 2, 1, 1};
        int result = Level1.ConquestCampaign(2, 2, 2, array);
        assertEquals(2, result);
    }
    @Test
    public void test3ConquestCampaign() {
        int[] array = {2, 2, 2, 2};
        int result = Level1.ConquestCampaign(2, 2, 2, array);
        assertEquals(3, result);
    }
    @Test
    public void test1() {
        int result = Level1.ConquestCampaign(1, 1, 1, new int[]{1, 1});
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = Level1.ConquestCampaign(1, 1, 2, new int[]{1, 1, 1, 1});
        assertEquals(1, result);
    }

    @Test
    public void test3() {
        int result = Level1.ConquestCampaign(1, 2, 2, new int[]{1, 1, 1, 1});
        assertEquals(2, result);
    }

    @Test
    public void test4() {
        int result = Level1.ConquestCampaign(2, 2, 2, new int[]{2, 2, 1, 1});
        assertEquals(2, result);
    }
    @Test
    public void test5() {
        int result = Level1.ConquestCampaign(2, 3, 6, new int[]{1,1,1,2,1,3,2,1,2,2,2,3});
        assertEquals(1, result);
    }


}

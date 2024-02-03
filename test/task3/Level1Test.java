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


}

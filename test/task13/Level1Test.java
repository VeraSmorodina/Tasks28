package task13;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void UFO1() {
        int[] expectedArray = new int[]{174, 83};
        int[] actualArray = Level1.UFO(2, new int[]{256, 123}, true);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void UFO2() {
        int[] expectedArray = new int[]{4660, 6007};
        int[] actualArray = Level1.UFO(2, new int[]{1234, 1777}, false);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void UFO3() {
        int[] expectedArray = new int[]{668, 1023};
        int[] actualArray = Level1.UFO(2, new int[]{1234, 1777}, true);
        assertArrayEquals(expectedArray, actualArray);
    }


}
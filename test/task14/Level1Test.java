package task14;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void unmanned1() {
        int expectedTime = 12;
        int[][] track = {{3, 5, 5}, {5, 2, 2}};
        int time = Level1.Unmanned(10, 2, track);
        assert expectedTime == time;
    }

    @Test
    public void unmanned2() {
        int expectedTime = 4;
        int[][] track = {{2, 2, 2}};
        int time = Level1.Unmanned(4, 1, track);
        assert expectedTime == time;
    }

    @Test
    public void unmanned3() {
        int expectedTime = 5;
        int[][] track = {{1, 2, 2}};
        int time = Level1.Unmanned(4, 1, track);
        assert expectedTime == time;
    }

    @Test
    public void unmanned4() {
        int expectedTime = 12;
        int[][] track = {{1, 2, 2}, {4, 5, 5}, {8, 2, 2}};
        int time = Level1.Unmanned(10, 3, track);
        assert expectedTime == time;
    }

    @Test
    public void unmanned5() {
        int expectedTime = 0;
        int x = Level1.trafficLights(8, new int[]{5, 2, 2});
        assert expectedTime == x;
    }

    @Test
    public void unmanned6() {
        int expectedTime = 2;
        int x = Level1.trafficLights(3, new int[]{3, 5, 5});
        assert expectedTime == x;
    }

    @Test
    public void unmanned7() {
        int expectedTime = 1;
        int x = Level1.trafficLights(4, new int[]{4, 5, 5});
        assert expectedTime == x;
    }

    @Test
    public void unmanned8() {
        int expectedTime = 11;
        int x = Level1.Unmanned(10, 1, new int[][]{{4, 5, 5}});
        assert expectedTime == x;
    }

    @Test
    public void unmanned9() {
        int expectedTime = 10;
        int x = Level1.Unmanned(10, 2, new int[][]{{11, 5, 5}, {15, 2, 2}});
        assert expectedTime == x;
    }

    @Test
    public void unmanned10() {
        int expectedTime = 10;
        int x = Level1.Unmanned(10, 2, new int[][]{{9, 5, 5}, {15, 2, 2}});
        assert expectedTime == x;
    }

    @Test
    public void unmanned11() {
//        int expectedTime = 11;
        int expectedTime = 10;
        int x = Level1.Unmanned(10, 3, new int[][]{{9, 5, 5}, {10, 2, 2}, {15, 2, 2}});
        assert expectedTime == x;
    }

    @Test
    public void unmanned12() {
        int expectedTime = 12;
        int x = Level1.Unmanned(10, 4, new int[][]{{5, 5, 5}, {8, 2, 2}, {11, 2, 2}, {15, 2, 2}});
        assert expectedTime == x;
    }

}
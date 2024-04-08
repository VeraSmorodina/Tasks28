package task25;


import org.junit.Test;

public class Level1Test {
    @Test
    public void transformTransform() {
        boolean result = Level1.TransformTransform(new int[]{1, 2, 3}, 3);
        boolean expectedResult = true;
        assert result == expectedResult;
    }

    @Test
    public void transformTransform2() {
        boolean result = Level1.TransformTransform(new int[]{1, 2, 1, 7, 2, 4, 3, 1, 5, 1, 2, 1, 6, 1, 2}, 15);
        boolean expectedResult = false;
        assert result == expectedResult;
    }
}
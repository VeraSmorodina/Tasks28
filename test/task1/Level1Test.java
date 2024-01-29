package task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {

    @Test
    public void squirrelTest() {
        int number = Level1.squirrel(5);
        assertEquals(1, number);
    }
}
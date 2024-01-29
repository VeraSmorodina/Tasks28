package task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Main1Test {

    @Test
    public void squirrelTest() {
        int number = Main1.squirrel(5);
        assertEquals(1, number);
    }
}
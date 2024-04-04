package task24;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void matrixTurn1() {
        String[] Matrix = new String[]{"12", "34"};
        Level1.MatrixTurn(Matrix, 2, 2, 1);
        String[] newMatrix = new String[]{"31", "42"};
        assertArrayEquals(newMatrix, Matrix);
    }

    @Test
    public void matrixTurn2() {
        String[] Matrix = new String[]{"12", "34"};
        Level1.MatrixTurn(Matrix, 2, 2, 2);
        String[] newMatrix = new String[]{"43", "21"};
        assertArrayEquals(newMatrix, Matrix);
    }

    @Test
    public void matrixTurn4() {
        String[] Matrix = new String[]{"12", "34"};
        Level1.MatrixTurn(Matrix, 2, 2, 3);
        String[] newMatrix = new String[]{"24", "13"};
        assertArrayEquals(newMatrix, Matrix);
    }

    @Test
    public void matrixTurn5() {
        String[] Matrix = new String[]{"12", "34", "56"};
        Level1.MatrixTurn(Matrix, 3, 2, 1);
        String[] newMatrix = new String[]{"31", "52", "64"};
        assertArrayEquals(newMatrix, Matrix);
    }

    @Test
    public void matrixTurn6() {
        String[] Matrix = new String[]{"12345", "67890", "86421", "37540"};
        Level1.MatrixTurn(Matrix, 4, 5, 1);
        String[] newMatrix = new String[]{"61234", "86785", "34290", "75401"};
        assertArrayEquals(newMatrix, Matrix);
    }

    @Test
    public void matrixTurn7() {
        String[] Matrix = new String[]{"5793018", "6787503", "1235487", "6543123", "5678901", "2135570"};
        Level1.MatrixTurn(Matrix, 6, 7, 1);
        String[] newMatrix = new String[]{"6579301", "1278758", "6543503", "5631487", "2789023","1355701"};
        assertArrayEquals(newMatrix, Matrix);
    }


}
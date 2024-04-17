package task27;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1 {
    public static boolean Football(int[] F, int N) {
        int[] expectedArray = Arrays.copyOf(F, F.length);
        Arrays.sort(expectedArray);
        if (Arrays.equals(expectedArray, F))
            return false;
        return arrangingSomeElements(F, expectedArray)
                || swappingElements(F, expectedArray)
                || arrangingAllElements(F, expectedArray);
    }

    public static boolean arrangingSomeElements(int[] array, int[] expectedArray) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean b = true;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (b && array[i] != expectedArray[i]) {
                list.add(array[i]);
                b = false;
            }
            if (!b && array[i] == expectedArray[i]) {
                index = i - 1;
                break;
            }
        }
        for (Integer integer : list) {
            if (index > 0) {
                array[index] = integer;
                index--;
            }
        }
        return Arrays.equals(expectedArray, array);
    }

    public static boolean swappingElements(int[] array, int[] expectedArray) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expectedArray[i])
                num++;
        }
        return num <= 2;
    }

    public static boolean arrangingAllElements(int[] array, int[] expectedArray) {
        for (int i = 0; i < array.length / 2 - 1; i++) {
            int number = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = number;
        }
        return Arrays.equals(expectedArray, array);
    }
}
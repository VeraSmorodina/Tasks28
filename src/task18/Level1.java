import java.util.Arrays;

public class Level1 {
    public static boolean MisterRobot(int N, int[] data) {
        int[] array1 = Arrays.copyOf(data, data.length);
        array1 = sort(array1);
        for (int i = 0; i < N - 2; i++) {
            if (data[i] == i + 1)
                continue;
            int index = getIndex(i + 1, data);
            data = index - 2 < i ? getArray(i + 1, i, data) : getArray(i + 1, index - 2, data);
            if (data[i] != i + 1)
                i--;
        }
        return Arrays.equals(data, array1);
    }

    public static int[] getArray(int val, int z, int[] array) {
        for (int i = 0; i < array.length && array[z] != val; i++) {
            int temp = array[z + 2];
            array[z + 2] = array[z + 1];
            array[z + 1] = array[z];
            array[z] = temp;
        }
        return array;
    }

    public static int getIndex(int val, int[] date) {
        for (int i = 0; i < date.length; i++) {
            if (date[i] == val)
                return i;
        }
        return -1;
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
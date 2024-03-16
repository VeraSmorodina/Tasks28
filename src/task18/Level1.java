package task18;

import java.util.Arrays;

public class Level1 {
    public static void main(String[] args) {
//        System.out.println(MisterRobot(7, new int[]{1, 3, 4, 5, 6, 2, 7}));
        System.out.println(MisterRobot(5, new int[]{1, 5, 2, 4, 3}));
        System.out.println(MisterRobot(5, new int[]{1, 2, 4, 5, 3}));
        System.out.println(MisterRobot(5, new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean MisterRobot(int N, int[] data) {
        int[] array1 = Arrays.copyOf(data, data.length);
        Arrays.sort(array1);
        int index = -1;
        for (int i = 0; i < N - 2; i++) {
            System.out.println(i + " i");
            if (data[i] == i + 1) {
                continue;
            }
            index = ind(i + 1, data);
            System.out.println(index + " index");
            System.out.println();
            if (index - 2 < i) {
                data = ar(i + 1, i, data);

                for (int datum : data) {
                    System.out.print(datum + "  ");
                }
                System.out.println();
            } else {
                data = ar(i + 1, index - 2, data);
                for (int datum : data) {
                    System.out.print(datum + "  ");
                }
            }
            if (data[i] != i + 1) {
                i--;
            }
            System.out.println();
        }
        if (Arrays.equals(data, array1))
            return true;
        return false;
    }

    public static int[] ar(int val, int z, int[] array) {
       for (int i = 0; i < array.length && array[z] != val; i++) {
            int temp = array[z + 2];
            array[z + 2] = array[z + 1];
            array[z + 1] = array[z];
            array[z] = temp;
        }
        return array;
    }

    public static int ind(int val, int[] date) {
        for (int i = 0; i < date.length; i++) {
            if (date[i] == val)
                return i;
        }
        return -1;
    }
}
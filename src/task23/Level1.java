package task23;

public class Level1 {
    public static String[] TreeOfLife(int H, int W, int N, String[] tree) {
        int[][] array = new int[H][W];
        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[i].length(); j++) {
                char c = tree[i].charAt(j);
                array[i][j] = c == '.' ? 0 : 1;
            }
        }
        for (int i = 0; i < N; i++) {
            array = i % 2 == 0 ? add(array) : del(array);
        }
        String[] strings = new String[H];
        for (int i = 0; i < array.length; i++) {
            String s = "";
            for (int j = 0; j < array[i].length; j++) {
                s = array[i][j] > 0 ? s + "+" : s + ".";
            }
            strings[i] = s;
        }
        return strings;
    }

    public static int[][] del(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + 1;
            }
        }
        Integer[][] array1 = new Integer[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array1[i][j] != null)
                    continue;
                if (array[i][j] < 3) {
                    array1[i][j] = array[i][j];
                    continue;
                }
                array1[i][j] = 0;
                if (i - 1 >= 0)
                    array1[i - 1][j] = 0;
                if (i + 1 < array.length && array[i + 1][j] < 3)
                    array1[i + 1][j] = 0;
                if (j - 1 >= 0)
                    array1[i][j - 1] = 0;
                if (j + 1 < array[i].length && array[i][j + 1] < 3)
                    array1[i][j + 1] = 0;
            }
        }
        int[][] res = new int[array.length][array[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                res[i][j] = array1[i][j];
            }
        }
        return res;
    }

    public static int[][] add(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + 1;
            }
        }
        return array;
    }
}
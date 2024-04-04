import java.util.ArrayList;

public class Level1 {
    public static void MatrixTurn(String[] Matrix, int M, int N, int T) {
        String[][] strings = new String[M][N];
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length(); j++) {
                strings[i][j] = Character.toString(Matrix[i].charAt(j));
            }
        }
        String[][] strings1 = new String[M][N];
        int number = 2;
        String[] top = new String[strings[0].length - number];
        String[] bottom = new String[strings[0].length - number];
        String[] left = new String[M];
        String[] right = new String[M];
        int y = 0;
        int x = M / 2;
        String[] res = new String[(M + N - 2) * 2];
        ArrayList<String[]> list = new ArrayList<>();
        while (x > 0) {
            int index = 0;
            int index1 = 0;
            int index2 = 0;
            int index3 = 0;
            for (int i = y; i < strings.length - y; i++) {
                for (int j = y; j < strings[i].length - y; j++) {
                    if (j == y) {
                        left[index2] = strings[i][j];
                        index2++;
                    }
                    if (j == N - 1 - y) {
                        right[index3] = strings[i][j];
                        index3++;
                    }
                    if (i == y && j != y && j != N - 1 - y) {
                        top[index] = strings[i][j];
                        index++;
                    }
                    if (i == strings.length - 1 - y && j != y && j != N - 1 - y) {
                        bottom[index1] = strings[i][j];
                        index1++;
                    }
                }
            }
            System.arraycopy(left, 0, res, 0, left.length);
            System.arraycopy(bottom, 0, res, left.length, bottom.length);
            for (int v = 0; v < right.length; v++)
                res[left.length + bottom.length + v] = right[right.length - 1 - v];
            for (int w = 0; w < top.length; w++)
                res[left.length + bottom.length + right.length + w] = top[top.length - 1 - w];
            y++;
            x--;
            list.add(res);
            if (x > 0) {
                res = new String[((M - number) + (N - number) - 2) * 2];
                left = new String[M - number];
                right = new String[M - number];
                number += 2;
                top = new String[strings[0].length - number];
                bottom = new String[strings[0].length - number];
            }
        }
        if (T < (M + N - 2) * 2) {
            for (String[] strings2 : list) {
                for (int i = 0; i < T; i++) {
                    String temp = strings2[0];
                    for (int j = 0; j < strings2.length - 1; j++) {
                        strings2[j] = strings2[j + 1];
                    }
                    strings2[strings2.length - 1] = temp;
                }
            }
        }
        for (int i = 0; i < M / 2; i++) {
            String[] array = list.get(i);
            int in = 0;
            int ind = 0;
            for (int v = i; v < strings1.length - i; v++) {
                for (int w = i; w < strings1[v].length - i; w++) {
                    if (w == i) {
                        strings1[v][w] = array[in];
                        in++;
                        ind++;
                    }
                    if (v == i && w < strings1[i].length - 2) {
                        strings1[v][w + 1] = array[array.length - ind];
                        ind++;
                    }
                    if (w == strings1[v].length - 1 - i)
                        strings1[v + i][w] = array[array.length - ind];
                    if (v == strings1.length - 1 - i && w < strings1[i].length - 1 - i) {
                        strings1[v][w + 1] = array[in];
                        in++;
                    }
                }
            }
        }
        for (int i = 0; i < strings1.length; i++) {
            String u = "";
            for (int j = 0; j < strings1[i].length; j++)
                u += strings1[i][j];
            Matrix[i] = u;
        }
    }
}
import java.util.ArrayList;

public class Level1 {
    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int[][] array1 = new int[N][M];
        int[][] array2 = new int[N][M];
        int result = 1;
        battalion = delete(battalion);
        L = battalion.length / 2;

        for (int i = 0; i < battalion.length; i += 2) {
            int x = battalion[i] - 1;
            int y = battalion[i + 1] - 1;
            array1[x][y] = 1;
            array2[x][y] = 1;
        }

        while (L != N * M) {
            result++;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (array1[i][j] == 1 && i - 1 >= 0 && array2[i - 1][j] != 1) {
                        array2[i - 1][j] = 1;
                        L++;
                    }
                    if (array1[i][j] == 1 && i + 1 < N && array2[i + 1][j] != 1) {
                        array2[i + 1][j] = 1;
                        L++;
                    }
                    if (array1[i][j] == 1 && j - 1 >= 0 && array2[i][j - 1] != 1) {
                        array2[i][j - 1] = 1;
                        L++;
                    }
                    if (array1[i][j] == 1 && j + 1 < M && array2[i][j + 1] != 1) {
                        array2[i][j + 1] = 1;
                        L++;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    array1[i][j] = array2[i][j];
                }
            }
        }
        return result;
    }
    public static int[] delete(int[] array){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i+=2) {
            if (array[i] == 0 && array[i + 1] == 0)
                continue;
            int x = array[i];
            int y = array[i +1];
            for (int j = 0; j < array.length; j++) {
                if (x == array[j] && y == array[j + 1]){
                    array[j] = 0;
                    array[j+1] = 0;
                }
            }
            arrayList.add(x);
            arrayList.add(y);
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}
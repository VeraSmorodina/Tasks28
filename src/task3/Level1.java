public class Level1 {
    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int[][] array1 = new int[N][M];
        int[][] array2 = new int[N][M];
        int result = 1;

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
}
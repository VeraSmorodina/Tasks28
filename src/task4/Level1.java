package task4;

import java.util.Arrays;

public class Level1 {
    public static int[] MadMax(int N, int[] Tele) {
        int[] resultArray = new int[N];
        Arrays.sort(Tele);
        int x = 2;
        for (int i = 0; i < N; i++) {
            if (i < N / 2) {
                resultArray[i] = Tele[i];
                continue;
            }
            if (i == N / 2) {
                resultArray[i] = Tele[N - 1];
                continue;
            }
            resultArray[i] = Tele[N - x];
            x++;
        }
        return resultArray;
    }
}

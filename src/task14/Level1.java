public class Level1 {
    public static int Unmanned(int L, int N, int[][] track) {
        int resultPath = 0;
        int x = 0;
        for (int i = 0; i <= L; i++) {
            if (i == track[x][0] && x == N - 1) {
                resultPath += trafficLights(resultPath, track[x]);
                continue;
            }
            if (i == track[x][0] && x < N - 1) {
                resultPath += trafficLights(resultPath, track[x]);
                x++;
                resultPath++;
                continue;
            }
            resultPath++;
        }
        return resultPath;
    }

    public static int trafficLights(int resultPath, int[] track) {
        int result = 0;
        int time = track[1];
        while (result < resultPath) {
            result += time;
        }
        return (result / time) % 2 == 0 ? 0 : result - resultPath;
    }
}
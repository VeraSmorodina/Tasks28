public class Level1 {
    public static int Unmanned(int L, int N, int[][] track) {
        if (L < track[0][0]){
            return L;
        }
        int resultPath = 0;
        int x = 0;
        for (int i = 0; i <= L; i++) {
            if (i == track[x][0] && x == N - 1) {
                resultPath += trafficLights(resultPath, track[x]);
                continue;
            }
            if (i == track[x][0] && x < N - 1) {
                resultPath += trafficLights(resultPath, track[x]) + 1;
                x++;
                continue;
            }
            if (L < track[x][0] && i==L) return resultPath;
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
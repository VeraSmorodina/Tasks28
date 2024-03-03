package task14;

public class Level1 {
    public static void main(String[] args) {
//        System.out.println(Unmanned(4, 1, new int[][]{{2,2,2}}));
//        System.out.println(Unmanned(10, 2, new int[][]{{3, 5, 5}, {5, 2, 2}}));
//        System.out.println(Unmanned(4, 1, new int[][]{{1,2,2}}));

//        int[][] track = {{1, 2, 2}, {4, 5, 5}, {8, 2, 2}};
//        System.out.println(Unmanned(10, 3, track));

//        int expectedTime = 14;
        System.out.println(Unmanned(10, 3, new int[][]{{1, 2, 2},{4,5,5},{8,2,2}}));
    }

    public static int Unmanned(int L, int N, int[][] track) {
        int resultPath = 0;
        int x = 0;
        for (int i = 0; i <= L; i++) {
            if (i == track[x][0]) {
                resultPath += trafficLights(resultPath, track[x]);
                if (x < N - 1) {
                    x++;
                    resultPath++;
                }
                continue;
            }
            resultPath++;
        }
        return resultPath;
    }

    public static int trafficLights(int resultPath, int[] track) {
        int result = 0;
        int red = track[1];
        while (result < resultPath) {
            result += red;
        }
        if ((result / red) % 2 != 0) {
            return result - resultPath;
        } else {
            return 0;
        }
    }
}
import java.text.DecimalFormat;

public class Level1 {
    public static String PatternUnlock(int N, int[] hits) {
        int[][] hits1 = {
                {6, 1, 9},
                {5, 2, 8},
                {4, 3, 7}
        };
        double totalLength = 0.0;
        for (int i = 0; i < hits.length - 1; i++) {
            int current = hits[i];
            int next = hits[i + 1];

            int[] currentPos = findPosition(hits1, current);
            int[] nextPos = findPosition(hits1, next);

            double length = calculateLength(currentPos[0], currentPos[1], nextPos[0], nextPos[1]);
            totalLength += length;
        }
        System.out.println(totalLength);
        DecimalFormat df = new DecimalFormat("#.#####");
        String formattedNumber = df.format(totalLength);
        String s1 = "";
        for (int i = 0; i < formattedNumber.length(); i++) {
            char currentChar = formattedNumber.charAt(i);
            if (currentChar != '0' && currentChar != ',') {
                s1 += currentChar;
            }
        }
        return s1;
    }

    private static int[] findPosition(int[][] hits1, int value) {
        for (int i = 0; i < hits1.length; i++) {
            for (int j = 0; j < hits1[i].length; j++) {
                if (hits1[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static double calculateLength(int x1, int y1, int x2, int y2) {
        double dx = (x2 - x1 < 0) ? -(x2 - x1) : (x2 - x1);
        double dy = (y2 - y1 < 0) ? -(y2 - y1) : (y2 - y1);
        return Math.sqrt(dx * dx + dy * dy);
    }
}

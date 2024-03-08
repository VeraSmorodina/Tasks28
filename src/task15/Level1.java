public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        String[] strArray1 = S1.split(" ");
        String[] strArray2 = S2.split(" ");
        int[][] coordinates = new int[strArray2.length][];
        boolean[] containsValues = new boolean[strArray2.length];
        int index = 0;
        boolean isNewCycle = false;
        for (int i = 0; i < strArray2.length; i++) {
            for (int j = index; j < strArray1.length; j++) {
                if (i != 0 && index != 0 && !strArray1[j].contains(strArray2[i])) {
                    i = -1;
                    index = j;
                    containsValues = new boolean[strArray2.length];
                    isNewCycle = true;
                    break;
                }
                isNewCycle = false;
                if (!strArray1[j].contains(strArray2[i]))
                    continue;
                containsValues[i] = true;
                coordinates[i] = new int[]{strArray1[j].indexOf(strArray2[i].charAt(0))};
                index = j + 1;
                break;
            }
            if (!isNewCycle && !containsValues[0])
                return false;
        }
        for (boolean value : containsValues) {
            if (!value)
                return false;
        }
        int first = coordinates[0][0];
        for (int[] coordinate : coordinates) {
            if (coordinate[0] != first)
                return false;
        }
        return true;
    }
}
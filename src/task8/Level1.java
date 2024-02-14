package task8;

public class Level1 {
    public static int SumOfThe(int N, int[] data) {
        int result = 0;
        boolean b = true;
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            result = data[i];
            for (int j = 0; j < data.length; j++) {
                if (i == j) {
                    continue;
                }
                sum += data[j];
                if (j == data.length - 1 && result == sum) {
                    b = false;
                    break;
                }
            }
            if (!b)
                break;
        }
        return result;
    }
}

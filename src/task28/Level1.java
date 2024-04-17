import java.util.Arrays;

public class Level1 {
    public static String Keymaker(int k) {
        int[] array = new int[k];
        Arrays.fill(array, 1);
        for (int v = 1; v < array.length; v++)
            for (int i = v; i < array.length; i += v + 1) {
                if (v == 1) {
                    array[i] = 0;
                    continue;
                }
                array[i] = array[i] == 0 ? 1 : 0;
            }
        StringBuilder line = new StringBuilder();
        for (int i : array)
            line.append(i);
        return line.toString();
    }
}
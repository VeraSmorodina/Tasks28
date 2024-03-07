import java.util.Arrays;

public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        boolean result = false;
        String[] strArray1 = S1.split(" ");
        String[] strArray2 = S2.split(" ");
        boolean[] array = new boolean[strArray2.length];
        Arrays.fill(array, false);
        int v = 0;
        for (int i = 0; i < strArray2.length; i++) {
            for (int j = v; j < strArray1.length; j++) {
                result = checkString(strArray1[j], strArray2[i]);
                v++;
                if (result) {
                    array[i] = result;
                    break;
                }
            }
            v--;
            if (result)
                continue;
            array[i] = false;
        }
        for (boolean b1 : array) {
            if (!b1)
                return false;
        }
        return true;
    }

    public static boolean checkString(String s1, String s2) {
        String str = "";
        int startIndex = s1.indexOf(s2.charAt(0));
        int endIndex = s1.indexOf(s2.charAt(s2.length() - 1), startIndex);
        if (startIndex != -1 && endIndex != -1)
            str = s1.substring(startIndex, endIndex + 1);
        if (s2.equals(str))
            return true;
        return false;
    }
}
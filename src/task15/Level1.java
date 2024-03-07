    import java.util.Arrays;

public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        boolean result = false;
        String[] strArray1 = S1.split(" ");
        String[] strArray2 = S2.split(" ");
        boolean[] b = new boolean[strArray2.length];
        Arrays.fill(b, false);
        int v = 0;
        for (int i = 0; i < strArray2.length; i++) {
              for (int j = v; j < strArray1.length; j++) {
                result = y(strArray1[j], strArray2[i]);
                v++;
                if (result) {
                    b[i] = result;
                    break;
                }
            }
            if (result)
                continue;
            b[i] = false;
        }
        for (boolean b1 : b) {
            if (!b1)
                return false;
        }
        return true;
    }

    public static boolean y(String s1, String s2) {
        String subStr = "";
        int startIndex = s1.indexOf(s2.charAt(0));
        int endIndex = s1.indexOf(s2.charAt(s2.length() - 1), startIndex);
        if (startIndex != -1 && endIndex != -1)
            subStr = s1.substring(startIndex, endIndex + 1);
        if (s2.equals(subStr))
            return true;
        return false;
    }
}
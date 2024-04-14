package task26;

import java.util.ArrayList;

public class Level1 {
    public static boolean white_walkers(String village) {
        ArrayList<String> array = new ArrayList<>();
        int startIndex = 0;
        boolean b = false;
        for (int i = 0; i < village.length(); i++) {
            if (!village.substring(i, i + 1).matches("\\d")) continue;
            if (!b) {
                startIndex = i;
                b = true;
                continue;
            }
            String string = village.substring(startIndex, i + 1);
            if (string.length() - 2 >= 3)
                array.add(string);
            startIndex = i;
            i--;
            b = false;
        }
        for (String string : array) {
            boolean b1 = true;
            for (int i = 1; i < string.length() - 1; i++)
                if (string.charAt(i) != '=') {
                    b1 = false;
                    break;
                }
            if (b1)
                return true;
        }
        return false;
    }
}
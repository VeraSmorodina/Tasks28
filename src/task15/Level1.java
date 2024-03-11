package task15;

import java.util.*;

public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        String[] strArray1 = S1.split(" ");
        String[] strArray2 = S2.split(" ");
        ArrayList<String> strings = new ArrayList<>();
        for (int j = 0; j < strArray1.length; j++) {
            if (!strArray1[j].contains(strArray2[0]))
                continue;
            List<Integer> list = new ArrayList<>();
            for (int index = strArray1[j].indexOf(strArray2[0]); index >= 0; index = strArray1[j].indexOf(strArray2[0], index + 1)) {
                list.add(index);
            }
            for (Integer integer : list) {
                for (int k = 0; k < H2; k++) {
                    if (k + j >= strArray1.length)
                        continue;
                    strings.add(strArray1[k + j].substring(integer, integer + W2));
                }
                String s1 = "";
                for (int k = 0; k < strings.size(); k++) {
                    s1 += k != strings.size() - 1 ? strings.get(k) + " " : strings.get(k);
                }
                strings.clear();
                if (s1.equals(S2))
                    return true;
            }
        }
        return false;
    }
}
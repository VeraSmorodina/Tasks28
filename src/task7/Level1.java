package task7;

import java.util.ArrayList;
import java.util.List;

public class Level1 {
    public static int[] WordSearch(int len, String s, String subs) {
        String[] words = s.split(" ");
        List<String> strings = new ArrayList<>();
        String s1 = "";

        for (int i = 0; i < words.length; i++) {
            if (s1.isEmpty() && words[i].length() < len && i != words.length - 1) {
                s1 += words[i];
            } else if (s1.isEmpty() && words[i].length() > len) {
                int x = (words[i].length() / len) % 2 == 0 ? words[i].length() / len : (words[i].length() / len) + 1;
                int x1 = 0;
                int x2 = x + 1;
                for (int j = 0; j < x; j++) {
                    if (j == x - 1) {
                        s1 = words[i].substring(x1 + 1);
                        strings.add(s1);
                        x1 += x;
                        x2 += x;
                        continue;
                    }
                    s1 = words[i].substring(x1, x2);
                    strings.add(s1);
                    x1 += x;
                    x2 += x;
                }
                s1 = "";
            } else if (i == words.length - 1 && s1.length() + words[i].length() + 1 <= len) {
                s1 += words[i];
                strings.add(s1);
            } else if (s1.isEmpty() && words[i].length() == len) {
                s1 += words[i];
                strings.add(s1);
                s1 = "";
            } else if (!s1.isEmpty() && s1.length() + words[i].length() + 1 < len) {
                s1 += " " + words[i];
            } else if (!s1.isEmpty() && s1.length() + words[i].length() + 1 == len) {
                s1 += " " + words[i];
                strings.add(s1);
                s1 = "";
            } else if (!s1.isEmpty() && s1.length() + words[i].length() + 1 > len) {
                strings.add(s1);
                i--;
                s1 = "";
            }
        }
        int[] result = new int[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            String s3 = strings.get(i);
            boolean b = check(s3, subs);
            if (b) {
                result[i] = 1;
                continue;
            }
            result[i] = 0;
        }
        return result;
    }

    public static boolean check(String s, String s1) {
        String[] array = s.split(" ");
        for (String string : array) {
            if (string.equals(s1))
                return true;
        }
        return false;
    }
}
package task9;

import java.util.ArrayList;

public class Level1 {
    public static String TheRabbitsFoot(String s, boolean encode) {
        if (!encode) {
            return decode(s);
        }
        if (s.length() == 1) {
            return s;
        }
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != ' ') {
                s1 += currentChar;
            }
        }
        double k = Math.sqrt(s1.length());
        int number1 = k % 1 == 0 ? (int) k : (int) k + 1;

        ArrayList<String> substrings = new ArrayList<>();
        String st;
        for (int i = 0; i < number1; i++) {
            st = "";
            for (int j = i; j < s1.length(); j += number1) {
                st += s1.charAt(j);
            }
            substrings.add(st);
        }

        String[] result = substrings.toArray(new String[0]);
        String m = "";
        for (int i = 0; i < result.length; i++) {
            if (i < result.length - 1) {
                m += result[i] + " ";
                continue;
            }
            m += result[i];
        }
        return m;
    }

    public static String decode(String s) {
        String[] ss = s.split(" ");
        int len = 0;
        for (String string : ss) {
            len += string.length();
        }
        double k = Math.sqrt(len);
        int number2 = (int) Math.round(k);

        String s1 = "";
        for (String string : ss) {
            for (int i = 0; i < number2 - string.length(); i++) {
                string += " ";
            }
            s1 += string;
        }

        ArrayList<String> substrings = new ArrayList<>();
        String st = "";
        for (int i = 0; i < number2; i++) {
            st = "";
            for (int j = i; j < s1.length(); j += number2) {
                st += s1.charAt(j);
            }
            substrings.add(st);
        }
        String words = "";
        for (String substring : substrings) {
            words += substring;
        }
        return words.trim();
    }
}
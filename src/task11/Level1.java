package task11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1 {
    public static String BigMinus(String s1, String s2) {
        int n = Math.max(s1.length(), s2.length());
        Integer[] num1;
        Integer[] num2;
        if (s1.length() > s2.length()) {
            num1 = x(s1, n);
            num2 = x(s2, n);
        } else if (s1.length() == s2.length()) {
            List<Integer[]> arrayList = y(s1, s2, n);
            num1 = arrayList.get(0);
            num2 = arrayList.get(1);
        } else {
            num1 = x(s2, n);
            num2 = x(s1, n);
        }
        int b = 0;
        String result = "";
        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - b;
            if (diff < 0) {
                diff += 10;
                b = 1;
            } else {
                b = 0;
            }
            result = diff + result;
        }
        while (result.length() > 1 && result.charAt(0) == '0') {
            result = result.substring(1);
        }
        return result;
    }

    public static Integer[] x(String s, int N) {
        Integer[] num = new Integer[N];
        Arrays.fill(num, 0);
        for (int i = 0; i < s.length(); i++) {
            num[N - s.length() + i] = s.charAt(i) - '0';
        }
        return num;
    }

    public static List<Integer[]> y(String s1, String s2, int N) {
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        Integer[] array1 = x(s1, N);
        Integer[] array2 = x(s2, N);
        boolean bS1 = false;
        for (int i = 0; i < N; i++) {
            if (array1[i] > array2[i]) {
                bS1 = true;
                break;
            }
        }
        arrayList.add(bS1 ? array1 : array2);
        arrayList.add(bS1 ? array2 : array1);
        return arrayList;
    }
}

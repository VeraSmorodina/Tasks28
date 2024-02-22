import java.util.ArrayList;
import java.util.stream.IntStream;

public class Level1 {
    public static String BigMinus(String s1, String s2) {
        int n = Math.max(s1.length(), s2.length());
        int[] num1;
        int[] num2;
        if (s1.length() > s2.length()) {
            num1 = x(s1, n);
            num2 = x(s2, n);
        } else if (s1.length() == s2.length()) {
            ArrayList<Integer[]> arrayList = y(s1, s2, n);
            num1 = z(arrayList.get(0));
            num2 = z(arrayList.get(1));
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

    public static int[] x(String s, int N) {
        int[] num = new int[N];
        for (int i = 0; i < s.length(); i++) {
            num[N - s.length() + i] = s.charAt(i) - '0';
        }
        return num;
    }

    public static ArrayList<Integer[]> y(String s1, String s2, int N) {
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        Integer[] array1 = IntStream.of(x(s1, N)).boxed().toArray(Integer[]::new);
        Integer[] array2 = IntStream.of(x(s2, N)).boxed().toArray(Integer[]::new);
        boolean bS1 = false;
        for (int i = 0; i < N; i++) {
            if (array1[i] > array2[i]) {
                bS1 = true;
                break;
            }
        }
        if (bS1) {
            arrayList.add(array1);
            arrayList.add(array2);
        } else {
            arrayList.add(array2);
            arrayList.add(array1);
        }
        return arrayList;
    }

    public static int[] z(Integer[] ar) {
        int[] result = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            result[i] = ar[i];
        }
        return result;
    }
}

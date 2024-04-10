package task26;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Level1 {
    public static void main(String[] args) {
        System.out.println(white_walkers("axxb6===4xaf5===eee5"));
    }

    public static boolean white_walkers(String village) {
        ArrayList<String> array = new ArrayList<>();
        int startIndex = 0;
        boolean b = false;

        for (int i = 0; i < village.length(); i++) {
//            if (village.charAt(i))
            if (!village.substring(i, i + 1).matches("\\d")) {
                System.out.println("+");
                continue;
            }
            if (!b) {
                System.out.println("-");
                startIndex = i;
                b = true;
                continue;
            }
            System.out.println("finish");
            array.add(village.substring(startIndex, i + 1));
            startIndex = i;
            b = false;
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }


        for (String string : array) {
            boolean b1 = false;
            for (int i = 1; i < string.length() - 1; i++) {
                if (string.length() - 2 % 3 != 0)
                    break;
                if (string.charAt(i) != '=')
                    b1 = true;
            }
            if (!b1)
                return true;
        }
        return false;
    }
}

package task26;

public class Level2 {
    public static void main(String[] args) {
        System.out.println(white_walkers("abc=7==hdjs=3gg1=======5"));
    }

    public static boolean white_walkers(String village) {
        int index = 0;
        String val1 = "";
        String val2 = "";
        boolean b = false;
        boolean res = false;
        for (int i = 0; i < village.length(); i++) {
            if (b && village.substring(i, i + 1).equals("=")) {
                index++;
                System.out.println("index++ " + index);
                continue;
            }
            if (b && !village.substring(i, i + 1).matches("\\d")) {
                b = false;
                System.out.println("false");
                index = 0;
            }
            if (b && index >= 3 && Integer.parseInt(val1) + Integer.parseInt(village.substring(i, i + 1)) <= 10) {
                val2 = village.substring(i, i + 1);
                System.out.println("val2 = " + val2);
                res = true;
                index = 0;
                continue;
            }
            if (!village.substring(i, i + 1).matches("\\d")) {
                System.out.println("continue");
                continue;
            }
            if (!b) {
                val1 = village.substring(i, i + 1);
                System.out.println("val1 = " + val1);
                b = true;
            }
        }
        return res;
    }
}

package task26;

public class Level2 {
    public static boolean white_walkers(String village) {
        int index = 0;
        String var1 = "";
        boolean b = false;
        boolean res = false;
        for (int i = 0; i < village.length(); i++) {
            if (b && village.substring(i, i + 1).equals("=")) {
                index++;
                continue;
            }
            if (b && !village.substring(i, i + 1).matches("\\d")) {
                b = false;
                index = 0;
            }
            if (b && index >= 3 && Integer.parseInt(var1) + Integer.parseInt(village.substring(i, i + 1)) <= 10) {
                res = true;
                index = 0;
                continue;
            }
            if (!village.substring(i, i + 1).matches("\\d"))
                continue;
            if (!b) {
                var1 = village.substring(i, i + 1);
                b = true;
            }
        }
        return res;
    }
}
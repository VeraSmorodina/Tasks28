package task17;

public class Level1 {
    public static boolean LineAnalysis(String line) {
        if ((line.charAt(0) != '*' || line.charAt(line.length() - 1) != '*') || line.charAt(0) != '*' && line.charAt(line.length() - 1) != '*')
            return false;
        boolean b1 = true;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != '*')
                b1 = false;
        }
        if (b1)
            return true;
        String[] array = line.split("\\*");
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() != array[1].length())
                return false;
        }
        return true;
    }
}

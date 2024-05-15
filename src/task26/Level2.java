package task26;

public class Level2 {
    public static void main(String[] args) {
//        System.out.println(white_walkers("axxb6===4xaf5===eee5"));
        System.out.println(white_walkers("abc=7==hdjs=3gg1=======5"));
    }

    public static boolean white_walkers(String village) {
        int startIndex = 0;
        String val1 = "";
        String val2 = "";
        boolean b = false;
        boolean res = false;
        for (int i = 0; i < village.length(); i++) {
            if (b && village.substring(i, i + 1).equals("=")) {
                startIndex++;
                System.out.println("startIndex++ " + startIndex);
                continue;
            }
            if (b && !village.substring(i, i + 1).matches("\\d")) {
                b = false;
                startIndex = 0;
            }
//            if (b && startIndex % 3 == 0 && Integer.parseInt(val1) + Integer.parseInt(village.substring(i, i + 1)) == 10) {
            if (b && startIndex >= 3 && Integer.parseInt(val1) + Integer.parseInt(village.substring(i, i + 1)) <= 10) {
                val2 = village.substring(i, i + 1);
                System.out.println("val2 = " + val2);
                res = true;
                startIndex = 0;
                continue;
            }
            if (!village.substring(i, i + 1).matches("\\d")) {
//                b = false;//?
                System.out.println("continue");
                continue;
            }
            if (!b) {
                val1 = village.substring(i, i + 1);
                System.out.println("val1 = " + val1);
                b = true;
                continue;
            }
            if (b && startIndex > 3 && startIndex % 3 == 0 && Integer.parseInt(val1) + Integer.parseInt(village.substring(i, i + 1)) == 10) {
                System.out.println("val2 = " + village.substring(i, i + 1));
                res = true;
            }
        }
        return res;
    }


//    public static boolean white_walkers(String village) {
//        ArrayList<String> array = new ArrayList<>();
//        int startIndex = 0;
//        boolean b = false;
//        for (int i = 0; i < village.length(); i++) {
//            if (!village.substring(i, i + 1).matches("\\d")) continue;
//            if (!b) {
//                startIndex = i;
//                b = true;
//                continue;
//            }
//            String string = village.substring(startIndex, i + 1);
//            System.out.println(string);
//            if (string.length() - 2 >= 3)
//                array.add(string);
//            startIndex = i;
//            i--;
//            b = false;
//        }
//        for (String string : array) {
//            boolean b1 = true;
//            for (int i = 1; i < string.length() - 1; i++)
//                if (string.charAt(i) != '=') {
//                    b1 = false;
//                    break;
//                }
//            if (b1)
//                return true;
//        }
//        return false;
//    }
}

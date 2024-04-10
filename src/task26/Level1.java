package task26;

import java.util.ArrayList;

public class Level1 {
    public static void main(String[] args) {
        System.out.println(white_walkers("5==ooooooo=5=5"));
    }
    public static boolean white_walkers(String village) {
        ArrayList<String> array = new ArrayList<>();
        int startIndex = 0;
        boolean b = false;
        for (int i = 0; i < village.length(); i++) {
            if (!village.substring(i, i + 1).matches("\\d"))
                continue;
            if (!b) {
                startIndex = i;
                b = true;
                continue;
            }
            String s = village.substring(startIndex, i + 1);
//            if (s.length()-2 % 3 == 0)
            if (s.length()-2 >= 3)
                array.add(s);
            s = "";



//            array.add(village.substring(startIndex, i + 1));
            startIndex = i;
            i--;
            b = false;
        }

        System.out.println(array.isEmpty() + "  usEmp");
        for (String s : array) {
            System.out.println(s);
        }



        for (String string : array) {
            boolean b1 = true;
            for (int i = 1; i < string.length() - 1; i++) {
                if (string.charAt(i) != '=')
                    b1 = false;
            }
            if (b1)
                return true;
        }
        return false;




//        for (String string : array) {
//            boolean b1 = true;
//
//            for (int i = 1; i < string.length() - 1; i++) {
//                if ((string.length() - 2) % 3 != 0){
////                    b1 = false;
//                    break;
//                }
////                else if ((string.length() - 2) % 3 != 0 && array.get(array.size()) == string){
////                    b1 = false;
////                    break;
////                }
//                if (string.charAt(i) != '=')
//                    b1 = false;
//            }
//            if (b1)
//                return true;
//        }
//        return false;
    }
}
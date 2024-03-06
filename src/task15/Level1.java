package task15;


import java.util.Arrays;

public class Level1 {
    public static void main(String[] args) {
//        boolean z = TankRush(3, 4, "1234 2345 0987", 2, 2, "34 98");
//        System.out.println(z);

//        boolean z = y("котик", "кот");
//        System.out.println(z);

        boolean z = TankRush(2, 2, "12 34", 2, 2, "34 12");
        System.out.println(z);
    }

    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        boolean result = false;
        String[] strArray1 = S1.split(" ");
        String[] strArray2 = S2.split(" ");
//        ArrayList<Boolean> res = new ArrayList<>();
        boolean[] b = new boolean[strArray2.length];
        Arrays.fill(b, false);

//        for (int i = 0; i < strArray2.length; i++) {
//            for (int j = 0; j < strArray1.length; j++) {
//                result = y(strArray1[j], strArray2[i]);
//                if (result) {
//                    res.add(result);
//                    break;
//                }
//            }
//            if (result) {
//                continue;
//            }
//            res.add(false);
//        }

        int v = 0;
        for (int i = 0; i < strArray2.length; i++) {
              for (int j = v; j < strArray1.length; j++) {
                result = y(strArray1[j], strArray2[i]);
                v++;
                if (result) {
                    b[i] = result;
                    break;
                }
            }
            if (result) {
                continue;
            }
            b[i] = false;
        }


//        for (Boolean re : res) {
//            System.out.println("re = " + re);
//        }

//        for (Boolean re : res) {
//            if (!re)
//                return false;
//        }
//        return true;

        for (int i = 0; i < b.length; i++) {
            if (!b[i])
                return false;
        }
        return true;
    }

    public static boolean y(String s1, String s2) {
        String subStr = "";
        int startIndex = s1.indexOf(s2.charAt(0));
        int endIndex = s1.indexOf(s2.charAt(s2.length() - 1), startIndex);
        if (startIndex != -1 && endIndex != -1) {
            subStr = s1.substring(startIndex, endIndex + 1);
        }
        System.out.println(subStr);
        if (s2.equals(subStr)) {
            return true;
        }
        return false;

//        boolean result = false;
//        int index1 = -1;
//        int index2 = -1;
//        if (s2.length() > s1.length())
//            return result;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) == s2.charAt(0)){
//                index1 = i;
//            }
//            if (index1 > -1 && s1.charAt(i) == s2.charAt(s2.length() - 1)){
//                index2 = i;
//            }
//        }
//        String s = s1.substring(index1, index2);
//        if (s.equals(s2)){
//            return true;
//        }
//        return false;
    }

//    public static int[][] FillInTheArray(int x, int y, String s){
//        int[][] array = new int[x][y];
//        String[] strArray = s.split(" ");
//        int index = 0;
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                array[i][j] = Integer.parseInt(strArray[index]);
//            }
//        }
//        return array;
//    }


//    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2){
//        boolean result = false;
//        int[][] array = FillInTheArray(H1, W1, S1);
//
//
//        return result;
//    }
//    public static int[][] FillInTheArray(int x, int y, String s){
//        int[][] array = new int[x][y];
//        String[] strArray = s.split(" ");
////        int[] intArray = new int[strArray.length];
////        for(int i = 0; i < strArray.length; i++) {
////            intArray[i] = Integer.parseInt(strArray[i]);
////        }
//        int index = 0;
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                array[i][j] = Integer.parseInt(strArray[index]);
//            }
//        }
//        return array;
//    }
}

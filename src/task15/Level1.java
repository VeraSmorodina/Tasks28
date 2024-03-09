package task15;

import java.util.*;

public class Level1 {
    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
        String[] strArray1 = S1.split(" ");
        String[] strArray2 = S2.split(" ");
        ArrayList<String> strings = new ArrayList<>();
        List<Integer> list;
        for (int j = 0; j < strArray1.length; j++) {
            if (strArray1[j].contains(strArray2[0])) {
                list = getIndexesList(strArray1[j], strArray2[0]);
                for (int i = 0; i < list.size(); i++) {
                    for (int k = 0; k < H2; k++) {
                        if (k+j >= strArray1.length || i >= list.size())
                            continue;
                        strings.add(strArray1[k + j].substring(list.get(i), list.get(i) + W2));
                    }
                    String s1 = "";
                    for (int k = 0; k < strings.size(); k++) {
                        s1 += k != strings.size() - 1 ? strings.get(k) + " " : strings.get(k);
                    }
                    strings.clear();
                    if (s1.equals(S2))
                        return true;
                }


            }
        }
        return false;
    }

//    public static String[][] getResult(int x, int y, String[] array, int H2, int W2) {
//        String[][] result = new String[H2][W2];
//        for (int i = 0; i < array.length; i++) {
//            if (i >= x &&)
//        }
//
//    }

    public static List<Integer> getIndexesList(String string, String subString) {
        List<Integer> list = new ArrayList<>();
        int index = string.indexOf(subString);
        while (index >= 0) {
            list.add(index);
//            System.out.println("Substring found at index: " + index);
            index = string.indexOf(subString, index + 1);
        }
        return list;
    }
}


//public class Level1 {
//    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
//        String[] strArray1 = S1.split(" ");
//        String[] strArray2 = S2.split(" ");
//        HashMap<Integer, Map<Integer, List<Integer>>> map = new HashMap<>();
//        for (int i = 0; i < strArray2.length; i++) {
//            Integer number = Integer.valueOf(strArray2[i]);
//            for (int j = 0; j < strArray1.length; j++) {
//                if (!strArray1[j].contains(strArray2[i]))
//                    continue;
//                if (!map.containsKey(number)) {
//                    map.put(number, new HashMap<>());
//                }
//                map.get(number).put(j, getIndexesList(strArray1[j], strArray1[i]));
//            }
//        }
//        if (map.size() == 1)
//            return false;
//
//        Set<Integer> keys = map.get(Integer.valueOf(strArray2[0])).keySet();
//        String s = strArray2[0] + " ";
//        int in = 0;
//        for (int i = 0; i < keys.size(); i++) {
//            for (int j = 1; j < strArray2.length; j++) {
//                Set<Integer> keys1 = map.get(Integer.valueOf(strArray2[j])).keySet();
//                if (keys[i].g == strArray2[j] + in){
//                    s+= j;
//                }
//            }
//        }
//
//    }
//
////    public static void main(String[] args) {
////        List<Integer> list = getIndexesList("Hello, Hello, Hello!", "Hello");
////        for (Integer i : list) {
////            System.out.println(i);
////        }
////    }
//
//    public static List<Integer> getIndexesList(String string, String subString) {
//        List<Integer> list = new ArrayList<>();
//        int index = string.indexOf(subString);
//        while (index >= 0) {
//            list.add(index);
////            System.out.println("Substring found at index: " + index);
//            index = string.indexOf(subString, index + 1);
//        }
//        return list;
//    }
//}
//
//public class Level1 {
//    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
//        String[] strArray1 = S1.split(" ");
//        String[] strArray2 = S2.split(" ");
//        int[][] coordinates = new int[strArray2.length][];
//        boolean[] containsValues = new boolean[strArray2.length];
//        int index = 0;
//        int in = 0;
//        int first = coordinates[0][0];
//        HashMap<Integer, Map<Integer, Integer>> map = new HashMap<>();
//        boolean isNewCycle = false;
//        for (int i = 0; i < strArray2.length; i++) {
//            for (int j = index; j < strArray1.length; j++) {
//                if (i != 0 && index != 0 && !strArray1[j].contains(strArray2[i])) {
//                    i = -1;
//                    index = j;
//                    containsValues = new boolean[strArray2.length];
//                    isNewCycle = true;
//                    break;
//                }
//                isNewCycle = false;
//                if (!strArray1[j].contains(strArray2[i]))
//                    continue;
//                containsValues[i] = true;
//                coordinates[i] = new int[]{strArray1[j].indexOf(strArray2[i].charAt(0))};
//                in++;
//                index = j + 1;
////                break;
//
//                boolean c = true;
//                for (boolean containsValue : containsValues) {
//                    if (!containsValue) {
//                        c = false;
//                    }
//                }
//                if (c) {
//                    break;
//                }
//            }
//            boolean m = true;
//            for (int[] coordinate : coordinates) {
//                if (coordinate[0] != first) {
//                    i = -1;
////                    index--;
//                    m = false;
//                    break;
//                }
//            }
//            if (m){
//                return true;
//            }
////            if (!isNewCycle && !containsValues[0])
////                return false;
//        }
//        return false;
//
////        for (boolean value : containsValues) {
////            if (!value)
////                return false;
////        }
////        int first = coordinates[0][0];
////        for (int[] coordinate : coordinates) {
////            if (coordinate[0] != first)
////                return false;
////        }
////        return true;
//    }
//}


//public class Level1 {
//    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {
//        String[] strArray1 = S1.split(" ");
//        String[] strArray2 = S2.split(" ");
//        int[][] coordinates = new int[strArray2.length][];
//        boolean[] containsValues = new boolean[strArray2.length];
//        int index = 0;
//        boolean isNewCycle = false;
//        for (int i = 0; i < strArray2.length; i++) {
//            for (int j = index; j < strArray1.length; j++) {
//                if (i != 0 && index != 0 && !strArray1[j].contains(strArray2[i])) {
//                    i = -1;
//                    index = j;
//                    containsValues = new boolean[strArray2.length];
//                    isNewCycle = true;
//                    break;
//                }
//                isNewCycle = false;
//                if (!strArray1[j].contains(strArray2[i]))
//                    continue;
//                containsValues[i] = true;
//                coordinates[i] = new int[]{strArray1[j].indexOf(strArray2[i].charAt(0))};
//                index = j + 1;
//                break;
//            }
//            if (!isNewCycle && !containsValues[0])
//                return false;
//        }
//        for (boolean value : containsValues) {
//            if (!value)
//                return false;
//        }
//        int first = coordinates[0][0];
//        for (int[] coordinate : coordinates) {
//            if (coordinate[0] != first)
//                return false;
//        }
//        return true;
//    }
//}


//    int startIndex = st.indexOf(s2.charAt(0));
//    //                    int endIndex = s1.indexOf(s2.charAt(s2.length() - 1), startIndex);
//    int startIndex = strArray1[j].indexOf(strArray2[i].charAt(0));
//    int endIndex = strArray1[j].indexOf(strArray2[i].charAt(strArray2[i].length() - 1), startIndex);
//                    if (startIndex != -1 && endIndex != -1) {
//                            subStr = s1.substring(startIndex, endIndex + 1);
//                            }

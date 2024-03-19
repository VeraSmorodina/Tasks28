package task19;

import java.lang.reflect.Array;
import java.util.*;

public class Level1 {
    public static String[] ShopOLAP(int N, String[] items) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] array;
        for (int i = 0; i < items.length; i++) {
            array = items[i].split(" ");
            if (map.containsKey(array[0])) {
                map.put(array[0], map.get(array[0]) + Integer.valueOf(array[1]));
                continue;
            }
            map.put(array[0], Integer.valueOf(array[1]));
        }
        HashSet<Integer> hashList = new HashSet<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (Integer i : map.values()) {
            arrayList1.add(i);
            hashList.add(i);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(hashList);
        Collections.sort(arrayList, Collections.reverseOrder());
        Collections.sort(arrayList1, Collections.reverseOrder());

        String[] result = new String[arrayList1.size()];
        List<String> strings;
        List<String> strings1 = new ArrayList<>();
        ArrayList<String> sss = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            for (String s : map.keySet()) {
                if (arrayList.get(i) == map.get(s))
                    sss.add(s);
            }
            strings = word(sss);
            for (String string : strings) {
                strings1.add(string);
            }
            strings.clear();
            sss.clear();
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = strings1.get(i) + " " + arrayList1.get(i);
        }
        return result;
    }

    public static List<String> word(ArrayList<String> faang) {
        List<String> sorted_list = new ArrayList<>(new TreeSet<>(faang));
        return sorted_list;
    }


//    public static String[] ShopOLAP(int N, String[] items) {
//        HashMap<String, Integer> map = new HashMap<>();
//        String[] array = new String[2];
//        for (int i = 0; i < items.length; i++) {
//            array = items[i].split(" ");
//            if (map.containsKey(array[0])) {
//                map.put(array[0], map.get(array[0]) + Integer.valueOf(array[1]));
//                continue;
//            }
//            map.put(array[0], Integer.valueOf(array[1]));
//        }
//        for (String i : map.keySet()) {
//            System.out.println("key: " + i + " value: " + map.get(i));
//        }
//        System.out.println();
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (Integer i : map.values()) {
//            arrayList.add(i);
//        }
//        Collections.sort(arrayList, Collections.reverseOrder());
//
//        String[] result = new String[arrayList.size()];
//        List<String> strings = new ArrayList<>();
//        String v = "";
//        String key = "";
//        int value = -1;
//        boolean b = false;
//        for (int i = 0; i < arrayList.size(); i++) {
//            for (String s : map.keySet()) {
//                if (arrayList.get(i) == map.get(s) && !b) {
//                    key = s;
//                    value = map.get(key);
//                    map.put(key, null);
//                    b = true;
////                    continue;
//                    break;
//                }
//                if (arrayList.get(i) == map.get(s) && b && map.get(s) == value && i - 1 >= 0) {
//                    strings = word(key, s);
//                    result[i - 1] = strings.get(0);
//                    result[i] = strings.get(1);
//                    strings.clear();
//                    b = false;
////                    continue;
//                    break;
//                }
//                result[i] = s;
//            }
//        }
//        return result;
//    }

//    public static List<String> word(String s, String s2) {
//        List<String> faang = Arrays.asList(s, s2);
//        List<String> sorted_list = new ArrayList<>(new TreeSet<>(faang));
//        return sorted_list;
//    }
}
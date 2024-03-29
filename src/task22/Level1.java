package task22;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Level1 {
    public static void main(String[] args) {
//        System.out.println(SherlockValidString(" xyz"));
//        System.out.println(SherlockValidString("xyzaa"));
//        System.out.println(SherlockValidString(" xxyyz"));
//        System.out.println(SherlockValidString("xyzzz"));

//        System.out.println(SherlockValidString("xxyyza"));
//        System.out.println(SherlockValidString("xxyyzabc"));

    }

    public static boolean SherlockValidString(String s) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String c = Character.toString(s.charAt(i));
            if (!map.containsKey(c)) {
                map.put(c, 1);
                continue;
            }
            map.put(c, map.get(c) + 1);
        }
        for (String i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
        System.out.println();


        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (Integer i : map.values()) {
            if (!map1.containsKey(i)) {
                map1.put(i, 1);
                continue;
            }
            map1.put(i, map1.get(i) + 1);
        }

//        Integer max = -1;
//        for (Integer i : map1.values()) {
//            if (i > max)
//                max = i;
//        }
//        System.out.println(max);


        Integer max = -1;
        Integer k = -1;
        for (Integer i : map1.keySet()) {
            if (map1.get(i) > max) {
                max = i;
                k = i;
            }
        }
        System.out.println(k);


        boolean b = true;
        boolean b1 = true;
//        for (Integer i : map.values()) {
//            if (b && map.get(i) != max && (map.get(i) - 1 == max || map.get(i) - 1 == 0)){
//                b = false;
//                continue;
//            }
//            if (map.get(i) != max) {
//                b1 = false;
//            }
////            if (b && map.get(i) != max && map.get(i) - 1 != 0){
////
////            }
//        }



        for (Integer i : map.values()) {
            if (i == k)
                continue;
//            if (b && map.get(i) != k && (map.get(i) - 1 == k || map.get(i) - 1 == 0)){
            if (b && i != k && (i - 1 == k || i - 1 == 0)) {
                b = false;
                continue;
            }
            if (map.get(i) != k) {
                b1 = false;
            }
        }

        System.out.println(b + " " + b1);
        return ((b && b1) || !b && b1) ? true : false;
    }
}

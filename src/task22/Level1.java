package task22;

import java.util.HashMap;

public class Level1 {
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
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (Integer i : map.values()) {
            if (!map1.containsKey(i)) {
                map1.put(i, 1);
                continue;
            }
            map1.put(i, map1.get(i) + 1);
        }
        Integer k = -1;
        for (Integer i : map1.keySet()) {
            if (map1.get(i) > k)
                k = i;
        }
        boolean b = true;
        boolean b1 = true;
        for (Integer i : map.values()) {
            if (i == k)
                continue;
            if (b && i != k && (i - 1 == k || i - 1 == 0)) {
                b = false;
                continue;
            }
            if (map.get(i) != k)
                b1 = false;
        }
        return b && b1 || !b && b1;
    }
}
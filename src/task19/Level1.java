package task19;

import java.util.*;

public class Level1 {
    public static String[] ShopOLAP(int N, String[] items) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String item : items) {
            String[] array = item.split(" ");
            if (map.containsKey(array[0])) {
                map.put(array[0], map.get(array[0]) + Integer.parseInt(array[1]));
                continue;
            }
            map.put(array[0], Integer.valueOf(array[1]));
        }
        HashSet<Integer> hashList = new HashSet<>(map.values());
        ArrayList<Integer> arrayList1 = new ArrayList<>(map.values());
        ArrayList<Integer> arrayList = new ArrayList<>(hashList);
        arrayList.sort(Collections.reverseOrder());
        arrayList1.sort(Collections.reverseOrder());

        String[] result = new String[arrayList1.size()];
        List<String> strings1 = new ArrayList<>();
        for (Integer integer : arrayList) {
            ArrayList<String> sss = new ArrayList<>();
            for (String s : map.keySet())
                if (Objects.equals(integer, map.get(s)))
                    sss.add(s);
            strings1.addAll(new TreeSet<>(sss));
        }
        for (int i = 0; i < result.length; i++)
            result[i] = strings1.get(i) + " " + arrayList1.get(i);
        return result;
    }
}
package task12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level1 {
    public static String MassVote(int N, int[] Votes) {
        String result = "";
        if (N != Votes.length && N == 1) {
            result += "minority winner 1";
            return result;
        }
        int resultInt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < Votes.length; i++) {
            map.put(i + 1, Votes[i]);
            sum += Votes[i];
            if (Votes[i] > resultInt) {
                resultInt = Votes[i];
            }
        }
        List<Integer> arrayList = y(map, resultInt);
        if (arrayList.size() != 1 || sum == 0) {
            return "no winner";
        }
        double percent = ((double) resultInt * 100) / sum;
        double scale = Math.pow(10, 2);
        percent = Math.floor(percent * scale) / scale;
        return percent > 50 ? "majority winner " + arrayList.get(0) : "minority winner " + arrayList.get(0);
    }

    public static List<Integer> y(Map<Integer, Integer> map1, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        map1.forEach((key, value) -> {
            if (value == x) {
                arrayList.add(key);
            }
        });
        return arrayList;
    }
}
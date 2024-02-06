package task5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level1 {
    public static int[] SynchronizingTables(int N, int[] ids, int[] salary) {
        int[] salary1 = salary.clone();
        Arrays.sort(salary1);
        int[] ids1 = ids.clone();
        Arrays.sort(ids1);

        Map<Integer, Integer> idToIndex = new HashMap<>();
        for (int i = 0; i < N; i++) {
            idToIndex.put(ids[i], i);
        }
        for (int i = 0; i < ids1.length; i++) {
            for (int j = 0; j < ids.length; j++) {
                if (ids1[i] == ids[j])
                    salary[j] = salary1[i];
            }
        }
        return salary;
    }
}
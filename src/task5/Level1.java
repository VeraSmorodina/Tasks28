import java.util.Arrays;

public class Level1 {
    public static int[] SynchronizingTables(int N, int[] ids, int[] salary) {
        int[] salary1 = salary.clone();
        Arrays.sort(salary1);
        int[] ids1 = ids.clone();
        Arrays.sort(ids1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (ids1[i] == ids[j])
                    salary[j] = salary1[i];
            }
        }
        return salary;
    }
}
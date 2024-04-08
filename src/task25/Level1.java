import java.util.ArrayList;

public class Level1 {
    public static boolean TransformTransform(int[] A, int N) {
        ArrayList<Integer> arrayList = addValues(A, N);
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++)
            array[i] = arrayList.get(i);
        ArrayList<Integer> arrayList1 = addValues(array, array.length);
        int sum = 0;
        for (int i = 0; i < arrayList1.size(); i++)
            sum += arrayList1.get(i);
        return sum % 2 == 0;
    }

    public static ArrayList<Integer> addValues(int[] A, int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= N - i - 1; j++) {
                int k = i + j;
                arrayList.add(searchMax(A, j, k));
            }
        }
        return arrayList;
    }

    public static int searchMax(int[] A, int j, int k) {
        int max = 0;
        for (int i = j; i <= k; i++)
            if (max < A[i])
                max = A[i];
        return max;
    }
}
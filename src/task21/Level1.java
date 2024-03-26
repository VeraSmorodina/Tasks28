import java.util.*;

public class Level1 {
    public static String word = "";

    public static String BiggerGreater(String input) {
        word = input;
        Set<String> uniquePermutations = generatePermutations(input.toCharArray(), 0, new HashSet<>());
        List<String> strings1 = new ArrayList<>(new TreeSet<>(uniquePermutations));
        return strings1.isEmpty() ? "" : strings1.get(0);
    }

    private static Set<String> generatePermutations(char[] arr, int index, Set<String> uniquePermutations) {
        if (index == arr.length && word.compareTo(new String(arr)) < 0) {
            uniquePermutations.add(new String(arr));
            return uniquePermutations;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1, uniquePermutations);
            swap(arr, index, i);
        }
        return uniquePermutations;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
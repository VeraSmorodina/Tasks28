package task21;

import java.util.*;

public class Level1 {
    public static String w = "";

    public static Set<String> BiggerGreater(String str) {
        Set<String> uniquePermutations = new HashSet<>();
        generatePermutations(str.toCharArray(), 0, uniquePermutations);
//        return uniquePermutations;
        return uniquePermutations;
    }

    private static void generatePermutations(char[] arr, int index, Set<String> uniquePermutations) {
        if (index == arr.length && w.compareTo(new String(arr)) < 0) {
            uniquePermutations.add(new String(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1, uniquePermutations);
            swap(arr, index, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
//        String str = "ая";
//        String str = "нклм";
//        String str = "fff";
//        String str = "вибк";
        String str = "вкиб";
        w = str;
        Set<String> uniquePermutations = BiggerGreater(str);
        List<String> strings1 = new ArrayList<>();
        strings1.addAll(new TreeSet<>(uniquePermutations));
        for (String s : strings1) {
            System.out.print(s + " + ");
        }
        System.out.println();
        if (strings1.isEmpty())
            System.out.println("-");
        else
            System.out.println(strings1.get(0));
//        for (String permutation : uniquePermutations) {
//            if (permutation.compareTo(str) > 0){
//                str = permutation;
//                System.out.println(permutation);
//            }
//
//            else System.out.println("-");
////            System.out.println(permutation);
//        }
    }
}

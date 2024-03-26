package task21;

import java.util.*;

public class Level1 {
    //    HashMap<String, Integer> map = new HashMap<String, Integer>();
//    public static void main(String[] args) {
//
//    }
//
//
//    public static String BiggerGreater(String input){
//        String word = input;
//        for (int i = 0; i < input.length(); i++) {
//            if (i != 0){
//               word = y(word);
//            }
//
//        }
//
//    }
//    public static String y(String input){
//        return "Hello";
//    }
    public static String w = "";

    public static Set<String> generateUniquePermutations(String str) {
        Set<String> uniquePermutations = new HashSet<>();
        generatePermutations(str.toCharArray(), 0, uniquePermutations);
        return uniquePermutations;
    }

    private static void generatePermutations(char[] arr, int index, Set<String> uniquePermutations) {
        if (index == arr.length && w.compareTo(new String(arr)) < 0) {
//        if (index == arr.length) {
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
        Set<String> uniquePermutations = generateUniquePermutations(str);

        List<String> strings1 = new ArrayList<>();
        strings1.addAll(new TreeSet<>(uniquePermutations));
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


//    public static Set<String> generateUniquePermutations(String str) {
//        Set<String> uniquePermutations = new HashSet<>();
//        generatePermutations(str.toCharArray(), 0, uniquePermutations);
//        return uniquePermutations;
//    }
//
//    private static void generatePermutations(char[] arr, int index, Set<String> uniquePermutations) {
//        if (index == arr.length && w.compareTo(new String(arr)) > 0) {
//            uniquePermutations.add(new String(arr));
//            return;
//        }
//
//        for (int i = index; i < arr.length; i++) {
//            swap(arr, index, i);
//            generatePermutations(arr, index + 1, uniquePermutations);
//            swap(arr, index, i);
//        }
//    }
//
//    private static void swap(char[] arr, int i, int j) {
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        String str = "ABC";
//        w = str;
//        Set<String> uniquePermutations = generateUniquePermutations(str);
//
//        System.out.println("Уникальные строки после перестановок:");
//        for (String permutation : uniquePermutations) {
//            System.out.println(permutation);
//        }
//    }

}

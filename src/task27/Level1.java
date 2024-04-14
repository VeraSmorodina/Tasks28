package task27;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1 {
//    public static void main(String[] args) {
////        int[] array = new int[]{1,3, 2};
////        int[] array = new int[]{3, 2, 1};
////        int[] array = new int[]{9, 5, 3, 7, 1};
//        int[] array = new int[]{1, 4, 3, 2, 5};
//        System.out.println(Football(array, array.length));
//    }

    public static boolean Football(int[] F, int N) {
        int[] expectedArray =  Arrays.copyOf(F, F.length);
        Arrays.sort(expectedArray);
        return changeTwoElements(F, expectedArray) || arrangingElements(F, expectedArray);
    }

    public static boolean changeTwoElements(int[] array, int[] expectedArray) {
        return x(array, expectedArray) || y(array, expectedArray);
    }

    public static boolean x(int[] array, int[] expectedArray) {
//        for (int i : array) {
//            System.out.println(i);
//        }
//        System.out.println();
//        for (int i : expectedArray) {
//            System.out.println(i);
//        }
//        System.out.println("-----");
        ArrayList<Integer> list = new ArrayList<>();
        boolean b = true;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (b && array[i] != expectedArray[i]) {
                System.out.println("+ " + array[i]);
                list.add(array[i]);
                b = false;
            }
            if (!b && array[i] == expectedArray[i]) {
                index = i - 1;
                break;
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
//        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {

            if (index > 0){
                array[index] = list.get(i);
                index--;
            }
        }
        return Arrays.equals(expectedArray, array);
    }

    public static boolean y(int[] array, int[] expectedArray) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != expectedArray[i])
                num++;
        }
        return num <= 2;
    }

    public static boolean arrangingElements(int[] array, int[] expectedArray) {
        for (int i = 0; i < array.length / 2 - 1; i++) {
            int number = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = number;
        }
        return Arrays.equals(expectedArray, array);
    }
}



























//    ArrayList<Integer> list = new ArrayList<>();
//        boolean b = true;
////        boolean b1 = true;
//        int inndex = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (b && array[i] != expectedArray[i]) {
//                list.add(array[i]);
//                b = false;
//            }
//            if (!b && array[i] == expectedArray[i]) {
//                inndex = i - 1;
//                break;
//            }
////            if (i - 1 >= 0 && array[i - 1] == expectedArray[i - 1] && array[i] != expectedArray[i])
////                break;
//        }
//        ArrayList<Integer> sortList = new ArrayList<>(list);
//        Collections.sort(sortList);
//        Collections.reverse(list);
//        for (int i = 0; i < array.length; i++) {
//
//        }
//        boolean b2 = true;
//        for (int i = 0; i < sortList.size(); i++) {
//            if (!sortList.get(i).equals(list.get(i))) {
//                b2 = false;
//            }
//        }
//        if (b2)
//            return true;
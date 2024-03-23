package task20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Level1 {
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> listNumber = new ArrayList<>();

    static String index = "-1";
    static String indexRedo = "-1";
    static String wordRedo = "";
    static String wordstepBack = "";
    static String word = "";


    public static void main(String[] args) {
//        System.out.println(BastShoe("1 Hello"));
//        System.out.println(BastShoe("1 !"));
//        System.out.println(BastShoe("2 1"));
//        System.out.println(BastShoe("2 5") + " )");
        System.out.println(BastShoe("1 Hello"));
        System.out.println(BastShoe("1  World!"));
//        System.out.println(BastShoe("3 1"));
        System.out.println(BastShoe("1 *"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("5"));
        System.out.println();

        System.out.println(BastShoe("1 *"));
        System.out.println(BastShoe("1 *"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("1 !"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));

    }

    public static String BastShoe(String command) {
        if (list.isEmpty())
            list.add("");
        String number = command.substring(0, 1);
        String word = "";
        if (command.length() > 1) {
            word = command.substring(2);
        }
        System.out.println(number + "___" + word);

        if (number.equals("1")) {
            add(list.get(list.size() - 1), word);
        }
        if (number.equals("2")) {
            delete(word);
        }
        if (number.equals("3")) {
            getASymbol(word);
        }
        if (number.equals("4")) {
            Undo();
        }
        if (number.equals("5")) {
            Redo();
        }
        listNumber.add(number);
        return list.get(list.size() - 1);
    }

    public static String Redo() {
        if (listNumber.get(listNumber.size() - 1).equals("5")) {
            System.out.println(">>>>>11");
            int n = Integer.valueOf(indexRedo);
//            for (int i = n - 1; i >= 0 ; i--) {
//                if ((listNumber.get(i).equals("4") && i - 1 < listNumber.size())) {
            for (int i = n + 1; i >= 0; i--) {
                System.out.println(listNumber.get(i).equals("4"));

                if ((listNumber.get(i).equals("4") && i - 1 >= 0)) {
                    indexRedo = Integer.toString(i);
                    wordRedo = list.get(i - 1);
                    list.add(list.get(i - 1));
                    return list.get(i - 1);
                }
//                return wordRedo;
            }
        } else {
            System.out.println(">>>>>22");
            for (int i = Integer.parseInt(listNumber.get(listNumber.size() - 1)); i >= 0; i--) {
                if ((listNumber.get(i).equals("4") && i + 1 < listNumber.size())) {
                    indexRedo = Integer.toString(i);
                    System.out.println(indexRedo);
                    wordRedo = list.get(i - 1);
                    list.add(list.get(i + 1));
                    return list.get(i + 1);
                }
            }
        }
        list.add("");
        return "";
    }


    public static String Undo() {
//        if (Objects.equals(listNumber.get(listNumber.size() - 1), "4") && Objects.equals(listNumber.get(listNumber.size() - 1), "4")) {
//
        System.out.println(listNumber.get(listNumber.size() - 1) + " + 4");
        if (Objects.equals(listNumber.get(listNumber.size() - 1), "4")) {
            System.out.println(">>>>>1");
            int n = Integer.valueOf(index);
            for (int i = n - 1; i >= 0; i--) {
                if ((listNumber.get(i).equals("1") || listNumber.get(i).equals("2")) && i - 1 >= 0) {
                    index = Integer.toString(i);
//                    list.add(list.get(i - 1));
//                    list.add(list.get(i - 1));
//                    return list.get(i - 1);
                    list.add(list.get(i));
                    return list.get(i);
                }
                if (listNumber.get(i).equals("1") && listNumber.get(i - 1).equals("4")) {
                    word = listNumber.get(i - 1);
                    y(i);
                    return word;
                }
            }
        }
        System.out.println(">>>>>2");
        for (int i = listNumber.size() - 1; i >= 0; i--) {
            if ((listNumber.get(i).equals("1") || listNumber.get(i).equals("2")) && i - 1 >= 0) {
                index = Integer.toString(i);
                System.out.println(index);
                list.add(list.get(i));
                return list.get(i);
//                list.add(list.get(i - 1));
//                return list.get(i - 1);
            }
        }
        list.add("");
        return "";
    }

    public static void y(int n) {
        for (int i = n; i >= 0; i--) {
            if (Objects.equals(listNumber.get(i), "4"))
                listNumber.set(Integer.valueOf(listNumber.get(i)), "0");
        }
    }


    public static String getASymbol(String s) {
        String value = list.get(list.size() - 1);
        int number = Integer.parseInt(s);
        if (number >= 0 && number < value.length() - 1) {
            String symbol = Character.toString(value.charAt(number));
            list.add(symbol);
            return symbol;
        }
        list.add("");
        return "";
    }

    public static String delete(String s) {
        String value = list.get(list.size() - 1);
        int number = Integer.parseInt(s);
        if (listNumber.get(listNumber.size() - 1).equals("4")){
            list.clear();
            listNumber.clear();
        }
        if (value.length() <= number) {
            list.add("");
            return "";
        }
        String word = value.substring(0, value.length() - number);
        list.add(word);
        return word;
    }

    public static String add(String s, String s1) {
        if (!listNumber.isEmpty() && listNumber.get(listNumber.size() - 1).equals("4")){
            list.clear();
            listNumber.clear();
        }
        String word = s + s1;
        if (list.size() == 1) {
            list.set(0, word);
            return word;
        }
        list.add(word);
        return word;
    }
}

import java.util.ArrayList;

public class Level1 {
    static ArrayList<String> list = new ArrayList<>();
    static String word = "";
    static int index = 0;

    public static String BastShoe(String command) {
        String number = command.substring(0, 1);
        String argument = "";
        if (command.length() > 1)
            argument = command.substring(2);
        switch (number) {
            case "1" -> add(argument);
            case "2" -> delete(argument);
            case "3" -> {
                return getASymbol(argument);
            }
            case "4" -> Undo();
            case "5" -> Redo();
        }
        return word;
    }

    public static void add(String s) {
        if (index < list.size() - 1) {
            String s1 = list.get(index);
            list.clear();
            list.add(s1);
        }
        word = word + s;
        list.add(word);
        index = list.size() - 1;
    }

    public static void delete(String s) {
        if (index < list.size() - 1) {
            String s1 = list.get(index);
            list.clear();
            list.add(s1);
        }
        int number = Integer.parseInt(s);
        word = number >= word.length() ? "" : word.substring(0, word.length() - number);
        list.add(word);
        index = list.size() - 1;
    }

    public static String getASymbol(String s) {
        int number = Integer.parseInt(s);
        if (number > word.length()) {
            return "";
        }
        return Character.toString(word.charAt(number));
    }

    public static void Undo() {
        if (index - 1 >= 0 && index - 1 < list.size()) {
            index = index - 1;
            word = list.get(index);
        }
    }

    public static void Redo() {
        if (index + 1 >= 0 && index + 1 < list.size()) {
            index = index + 1;
            word = list.get(index);
        }
    }
}
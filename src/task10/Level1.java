package task10;

import java.util.HashMap;

public class Level1 {

    public static int PrintingCosts(String Line) {
        int result = 0;
        HashMap<Character, Integer> map = creetMap();
        for (int i = 0; i < Line.length(); i++) {
            char ch = Line.charAt(i);
            Integer number = map.get(ch);
            if (number != null){
                result += number;
                continue;
            }
            result += 23;
        }
        return result;
    }

    public static HashMap<Character, Integer> creetMap() {
        HashMap<Character, Integer> capitalCities = new HashMap<>();
        capitalCities.put(' ', 0);
        capitalCities.put('&', 24);
        capitalCities.put(',', 7);
        capitalCities.put('2', 22);
        capitalCities.put('8', 23);
        capitalCities.put('>', 10);
        capitalCities.put('D', 26);
        capitalCities.put('J', 18);
        capitalCities.put('P', 23);
        capitalCities.put('V', 19);
        capitalCities.put('\\', 10);
        capitalCities.put('b', 25);
        capitalCities.put('h', 21);
        capitalCities.put('n', 18);
        capitalCities.put('t', 17);
        capitalCities.put('z', 19);
        capitalCities.put('!', 9);
        capitalCities.put('\'', 3);
        capitalCities.put('-', 7);
        capitalCities.put('3', 23);
        capitalCities.put('9', 26);
        capitalCities.put('?', 15);
        capitalCities.put('E', 26);
        capitalCities.put('K', 21);
        capitalCities.put('Q', 31);
        capitalCities.put('W', 26);
        capitalCities.put(']', 18);
        capitalCities.put('c', 17);
        capitalCities.put('i', 15);
        capitalCities.put('o', 20);
        capitalCities.put('u', 17);
        capitalCities.put('{', 18);
        capitalCities.put('"', 6);
        capitalCities.put('#', 24);
        capitalCities.put('$', 29);
        capitalCities.put('%', 22);
        capitalCities.put('(', 12);
        capitalCities.put(')', 12);
        capitalCities.put('*', 17);
        capitalCities.put('+', 13);
        capitalCities.put('.', 4);
        capitalCities.put('/', 10);
        capitalCities.put('0', 22);
        capitalCities.put('1', 19);
        capitalCities.put('4', 21);
        capitalCities.put('5', 27);
        capitalCities.put('6', 26);
        capitalCities.put('7', 16);
        capitalCities.put(':', 8);
        capitalCities.put(';', 11);
        capitalCities.put('<', 10);
        capitalCities.put('=', 14);
        capitalCities.put('@', 32);
        capitalCities.put('A', 24);
        capitalCities.put('B', 29);
        capitalCities.put('C', 20);
        capitalCities.put('F', 20);
        capitalCities.put('G', 25);
        capitalCities.put('H', 25);
        capitalCities.put('I', 18);
        capitalCities.put('L', 16);
        capitalCities.put('M', 28);
        capitalCities.put('N', 25);
        capitalCities.put('O', 26);
        capitalCities.put('R', 28);
        capitalCities.put('S', 25);
        capitalCities.put('T', 16);
        capitalCities.put('U', 23);
        capitalCities.put('X', 18);
        capitalCities.put('Y', 14);
        capitalCities.put('Z', 22);
        capitalCities.put('[', 18);
        capitalCities.put('^', 7);
        capitalCities.put('_', 8);
        capitalCities.put('`', 3);
        capitalCities.put('a', 23);
        capitalCities.put('d', 25);
        capitalCities.put('e', 23);
        capitalCities.put('f', 18);
        capitalCities.put('g', 30);
        capitalCities.put('j', 20);
        capitalCities.put('k', 21);
        capitalCities.put('l', 16);
        capitalCities.put('m', 22);
        capitalCities.put('p', 25);
        capitalCities.put('q', 25);
        capitalCities.put('r', 13);
        capitalCities.put('s', 21);
        capitalCities.put('v', 13);
        capitalCities.put('w', 19);
        capitalCities.put('x', 13);
        capitalCities.put('y', 24);
        capitalCities.put('|', 12);
        capitalCities.put('}', 18);
        capitalCities.put('~', 9);
        return capitalCities;
    }
}

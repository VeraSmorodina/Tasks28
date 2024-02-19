public class Level1 {
    public static String BigMinus(String s1, String s2){
        String result = "";
        int number1 = Integer.parseInt(s1);
        int number2 = Integer.parseInt(s2);
        int difference = Math.abs(number1 - number2);
        result += difference;
        return result;
    }
}

public class Level1 {
    public static int[] UFO(int N, int[] data, boolean octal) {
        int[] result = new int[N];
        int number = octal ? 8 : 16;
        String numberAsString;
        for (int i = 0; i < N; i++) {
            numberAsString = String.valueOf(data[i]);
            int[] intArray = new int[numberAsString.length()];
            for (int j = 0; j < numberAsString.length(); j++) {
                intArray[j] = Character.getNumericValue(numberAsString.charAt(j));
            }
            int sum = 0;
            int index = 0;
            for (int j = intArray.length - 1; j >= 0; j--) {
                sum += intArray[j] * (int) Math.pow(number, index);
                index++;
            }
            result[i] = sum;
        }
        return result;
    }
}

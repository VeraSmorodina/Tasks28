package task16;

import java.util.Arrays;
import java.util.Collections;
public class Level1 {
   public static int MaximumDiscount(int N, int[] price) {
        int result = 0;
        Integer[] integerArray = new Integer[price.length];
        for (int i = 0; i < price.length; i++) {
            integerArray[i] = Integer.valueOf(price[i]);
        }
        Arrays.sort(integerArray, Collections.reverseOrder());
        for (int i = 0; i < integerArray.length; i++) {
            if ((i + 1) % 3 == 0){
                result += integerArray[i];
            }
        }
        return result;
    }
}
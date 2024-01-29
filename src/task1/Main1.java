package task1;

public class Main1 {
    public static int squirrel(int number){
        int factorial = 1;
        if (number <= 0)
           return -1;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }
        int figure = 0;
        while (factorial > 0) {
            figure = factorial % 10;
            factorial /= 10;
        }
        return figure;
    }
}

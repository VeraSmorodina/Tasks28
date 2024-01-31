public class Level1 {
    public static int odometer(int[] oksana) {
        int speed = 0;
        int kilometers = 0;
        int time = 0;
        for (int i = 0; i < oksana.length; i++) {
            if (i % 2 == 0) {
                speed = oksana[i];
                continue;
            }
            kilometers = kilometers + speed * (oksana[i] - time);
            time = oksana[i];
        }
        return kilometers;
    }
}

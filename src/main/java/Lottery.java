import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        Integer[] balls = new Integer[100];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }

        List<Integer> ballList = Arrays.asList(balls);
        Collections.shuffle(ballList);

        for (int i = 0; i < 10; i++) {
            System.out.println(ballList.get(i));
        }
    }
}

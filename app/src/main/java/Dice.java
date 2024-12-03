import java.util.Random;

public class Dice {
    private int value;

    /**
     * ランダムに1から6の値を取得する
     */
    public Dice() {
        value = play();
    }

    public int play() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }
}

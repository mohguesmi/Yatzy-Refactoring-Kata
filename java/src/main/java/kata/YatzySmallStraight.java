package src.main.java.kata;

import java.util.Arrays;

public class YatzySmallStraight extends DiceMove {

    public YatzySmallStraight(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    public boolean isSmallStraight() {
        return sort().equals(Arrays.asList(1, 2, 3, 4, 5));
    }

    @Override
    public int scores() {
        if (isSmallStraight()) {
            return 15;
        }
        return 0;
    }
}

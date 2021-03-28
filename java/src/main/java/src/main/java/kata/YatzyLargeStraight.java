package src.main.java.kata;

import java.util.Arrays;

public class YatzyLargeStraight extends DiceMove  {

    public YatzyLargeStraight(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    public boolean isLargeStraight() {
        return sort().equals(Arrays.asList(2, 3, 4, 5, 6));
    }

    @Override
    public int scores() {
        if (isLargeStraight()) {
            return 20;
        }
        return 0;
    }
}

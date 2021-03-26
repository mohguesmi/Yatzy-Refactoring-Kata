package src.main.java.kata;

import java.util.List;

public class YatzyTwoPairs extends YatzyPairs{

    public YatzyTwoPairs(int d1, int d2 , int d3 , int d4 , int d5) {
        super(d1,d2,d3,d4,d5);
    }

    @Override
    public int scores() {
        List<Integer> pairs = findPairs();
        if (pairs.size() >= 2) {
            return pairs.stream()
                    .mapToInt(pair -> pair * 2)
                    .sum();
        }
        return 0;
    }
}

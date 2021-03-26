package src.main.java.kata;

public class YatzyFullHouse extends YatzyThreeOfKind {

    public YatzyFullHouse(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    public boolean isFullHouse() {
        boolean hasThreeOfAKind = getDiceWithCountGreaterThan(3) != 0;
        boolean hasPair = !findPairs().isEmpty();
        boolean isYatzy = isYatzy();
        return hasThreeOfAKind && hasPair && !isYatzy;
    }

    @Override
    public int scores() {
        if (isFullHouse()) {
            return sum();
        }
        return 0;
    }
}

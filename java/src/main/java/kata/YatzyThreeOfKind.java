package src.main.java.kata;

public class YatzyThreeOfKind extends YatzyPairs {

    public YatzyThreeOfKind(int d1, int d2 , int d3 , int d4 , int d5) {
        super(d1,d2,d3,d4,d5);
    }

    public int getDiceWithCountGreaterThan(int n) {
        return filterDiceGreaterThan(n)
                .findFirst()
                .orElse(0);
    }
    @Override
    public int scores() {
        return getDiceWithCountGreaterThan(3) * 3;
    }
}

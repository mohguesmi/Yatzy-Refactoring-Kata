package src.main.java.kata;

public class YatzyOnes extends DiceMove {

    public YatzyOnes(int d1, int d2 , int d3 , int d4 , int d5) {
        super(d1,d2,d3,d4,d5);
    }

    @Override
    public  int scores() {
        return countDice(1);
    }
}

package src.main.java.kata;

public class YatzySixes extends DiceMove {

    public YatzySixes(int d1, int d2 , int d3 , int d4 , int d5) {
        super(d1,d2,d3,d4,d5);
    }
    @Override
    public  int scores() {
        return countDice(6) * 6;
    }
}

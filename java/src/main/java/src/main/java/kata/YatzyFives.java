package src.main.java.kata;

public class YatzyFives extends DiceMove {

    public YatzyFives(int d1, int d2 , int d3 , int d4 , int d5) {
        super(d1,d2,d3,d4,d5);
    }
    @Override
    public  int scores() {
        return countDice(5) * 5;
    }
}
package src.main.java.kata;

public class Chance extends DiceMove {

    public Chance(int d1, int d2 , int d3 , int d4 , int d5) {
        super(d1,d2,d3,d4,d5);
    }

    public int scores() {
        return sum();
    }

}

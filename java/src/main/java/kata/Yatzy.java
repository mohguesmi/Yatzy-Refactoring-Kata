package src.main.java.kata;

public class Yatzy extends DiceMove{

    public Yatzy(int d1, int d2, int d3, int d4, int d5) {
        super(d1, d2, d3, d4, d5);
    }

    // check if yatzy
    public boolean isYatzy(){
        return countAlldicesOccurence().values().stream().anyMatch(i -> i == 5);
    }

    public int scores() {
        if (this.isYatzy()) {
            return 50;
        }
        return 0;
    }
}




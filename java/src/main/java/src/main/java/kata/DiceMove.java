package src.main.java.kata;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class DiceMove {

    private final List<Integer> dices;

    public DiceMove(int d1, int d2 , int d3 , int d4 , int d5) {
        dices = Arrays.asList(d1,d2,d3,d4,d5);
    }

    // method to return final score
    public abstract int scores();

    // return sum
    public int sum() {
        return dices.stream().mapToInt(Integer::intValue).sum();
    }

    // return occurences of every number
    public Map<Integer,Integer> countAlldicesOccurence(){
       return  dices.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.reducing(0, e -> 1, Integer::sum)));
    }

    public int countDice(int dice) {
        return countAlldicesOccurence().getOrDefault(dice, 0);
    }


    protected List<Integer> sort() {
        return dices.stream().sorted().collect(Collectors.toList());
    }

}

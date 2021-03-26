package src.main.java.kata;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YatzyPairs extends Yatzy {

    public YatzyPairs(int d1, int d2 , int d3 , int d4 , int d5) {
        super(d1,d2,d3,d4,d5);
    }

    // filter dice number greater than int , and return stream of integer
    protected Stream<Integer> filterDiceGreaterThan(int number){
        return countAlldicesOccurence().entrySet().stream()
                .filter(i -> i.getValue() > number)
                .map(Map.Entry::getKey) ;
    }

    public List<Integer> findPairs() {
        return filterDiceGreaterThan(2)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    @Override
    public int scores() {
        List<Integer> pairs = findPairs();
        if (pairs.isEmpty()) {
            return 0;
        }  else {
            return pairs.get(0) * 2;
        }
    }
}

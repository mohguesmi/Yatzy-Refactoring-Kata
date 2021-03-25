import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiceMove {

    private final List<Integer> dices;

    public DiceMove(int d1, int d2 , int d3 , int d4 , int d5) {
        dices = Arrays.asList(d1,d2,d3,d4,d5);
    }
    // return sum
    public int counts(){
        return dices.stream().collect(Collectors.summingInt(Integer::intValue));
    }

    // count by occurence
    public int countByOccurence(int occurenceNumber){
        return this.dices.stream().filter(i -> Collections.frequency(dices, occurenceNumber) > 1)
                .collect(Collectors.summingInt(Integer::intValue));
    }

    // return occurences of every number
    public Map<Integer,Integer> countAlldicesOccurence(){
       return  dices.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.reducing(0, e -> 1, Integer::sum)));
    }
    // check if yatzy
    public boolean isYatzy(){
        return countAlldicesOccurence().values().stream().anyMatch(i -> i == 5);
    }

    private List<Integer> sort() {
        return dices.stream().sorted().collect(Collectors.toList());
    }
    // filter dice number greater than int , and return stream of integer
    private Stream<Integer> filterDiceGreaterThan(int number){
        return countAlldicesOccurence().entrySet().stream()
                .filter(i -> i.getValue() > number)
                .map(Map.Entry::getKey) ;
    }

    public List<Integer> findPairs() {
        return filterDiceGreaterThan(2)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public int getDiceWithCountGreaterThan(int n) {
        return filterDiceGreaterThan(n)
                .findFirst()
                .orElse(0);
    }

    public boolean isSmallStraight() {
        return sort().equals(Arrays.asList(1, 2, 3, 4, 5));
    }

    public boolean isLargeStraight() {
        return sort().equals(Arrays.asList(2, 3, 4, 5, 6));
    }

    public boolean isFullHouse() {
        boolean hasThreeOfAKind = getDiceWithCountGreaterThan(3) != 0;
        boolean hasPair = !findPairs().isEmpty();
        boolean isYatzy = isYatzy();
        return hasThreeOfAKind && hasPair && !isYatzy;
    }
}

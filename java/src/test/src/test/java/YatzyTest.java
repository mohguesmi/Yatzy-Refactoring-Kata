package src.test.java;

import org.junit.*;
import src.main.java.kata.*;

import static org.junit.Assert.*;

public class YatzyTest {


    @Test
    public void chance() {
        Chance chance1 = new Chance(2, 3, 4, 5, 1);
        Chance chance2 = new Chance(3, 3, 4, 5, 1);
        Chance chance3 = new Chance(1, 1, 3, 3, 6);
        Chance chance4 = new Chance(4, 5, 5, 6, 1);

        assertEquals(15, chance1.scores());
        assertEquals(16, chance2.scores());
        assertEquals(14, chance3.scores());
        assertEquals(21, chance4.scores());
    }

    @Test
    public void yatzy() {
        Yatzy yatzy1 = new Yatzy(4, 4, 4, 4, 4);
        Yatzy yatzy2 = new Yatzy(6, 6, 6, 6, 6);
        Yatzy yatzy3 = new Yatzy(6, 6, 6, 6, 3);
        Yatzy yatzy4 = new Yatzy(1, 1, 1, 1, 1);
        Yatzy yatzy5 = new Yatzy(1, 1, 1, 2, 1);

        assertEquals(50, yatzy1.scores());
        assertEquals(50, yatzy2.scores());
        assertEquals(0, yatzy3.scores());
        assertEquals(50, yatzy4.scores());
        assertEquals(0, yatzy5.scores());
    }

    @Test
    public void ones() {
        YatzyOnes ones1 = new YatzyOnes(1, 2, 3, 4, 5);
        YatzyOnes ones2 = new YatzyOnes(1, 2, 1, 4, 5);
        YatzyOnes ones3 = new YatzyOnes(6, 2, 2, 4, 5);
        YatzyOnes ones4 = new YatzyOnes(1, 2, 1, 1, 1);
        YatzyOnes ones5 = new YatzyOnes(3, 3, 3, 4, 5);

        assertEquals(1, ones1.scores());
        assertEquals(2, ones2.scores());
        assertEquals(0, ones3.scores());
        assertEquals(4, ones4.scores());
        assertEquals(0, ones5.scores());
    }

    @Test
    public void twos() {
        YatzyTwos twos1 = new YatzyTwos(1, 2, 3, 2, 6);
        YatzyTwos twos2 = new YatzyTwos(2, 2, 2, 2, 2);
        YatzyTwos twos3 = new YatzyTwos(2, 3, 2, 5, 1);

        assertEquals(4, twos1.scores());
        assertEquals(10, twos2.scores());
        assertEquals(4, twos3.scores());
    }

    @Test
    public void threes() {
        YatzyThrees threes1 = new YatzyThrees(1, 2, 3, 2, 3);
        YatzyThrees threes2 = new YatzyThrees(2, 3, 3, 3, 3);

        assertEquals(6, threes1.scores());
        assertEquals(12, threes2.scores());
    }

    @Test
    public void fours() {
        YatzyFours fours1 = new YatzyFours(4, 4, 4, 5, 5);
        YatzyFours fours2 = new YatzyFours(4, 4, 5, 5, 5);
        YatzyFours fours3 = new YatzyFours(4, 5, 5, 5, 5);
        YatzyFours fours4 = new YatzyFours(1, 1, 2, 4, 4);

        assertEquals(12, fours1.scores());
        assertEquals(8, fours2.scores());
        assertEquals(4, fours3.scores());
        assertEquals(8, fours4.scores());
    }

    @Test
    public void fives() {
        YatzyFives fives1 = new YatzyFives(4, 4, 4, 5, 5);
        YatzyFives fives2 = new YatzyFives(4, 4, 5, 5, 5);
        YatzyFives fives3 = new YatzyFives(4, 5, 5, 5, 5);

        assertEquals(10, fives1.scores());
        assertEquals(15, fives2.scores());
        assertEquals(20, fives3.scores());
    }

    @Test
    public void sixes() {
        YatzySixes sixes1 = new YatzySixes(4, 4, 4, 5, 5);
        YatzySixes sixes2 = new YatzySixes(4, 4, 6, 5, 5);
        YatzySixes sixes3 = new YatzySixes(6, 5, 6, 6, 5);

        assertEquals(0, sixes1.scores());
        assertEquals(6, sixes2.scores());
        assertEquals(18, sixes3.scores());
    }

    @Test
    public void pairs() {
        YatzyPairs pairs1 = new YatzyPairs(3, 4, 3, 5, 6);
        YatzyPairs pairs2 = new YatzyPairs(5, 3, 3, 3, 5);
        YatzyPairs pairs3 = new YatzyPairs(5, 3, 6, 6, 5);
        YatzyPairs pairs4 = new YatzyPairs(3, 3, 3, 4, 4);
        YatzyPairs pairs5 = new YatzyPairs(1, 1, 6, 2, 6);
        YatzyPairs pairs6 = new YatzyPairs(3, 3, 3, 4, 1);
        YatzyPairs pairs7 = new YatzyPairs(3, 3, 3, 3, 1);
        YatzyPairs pairs8 = new YatzyPairs(1, 2, 3, 4, 5);

        assertEquals(6, pairs1.scores());
        assertEquals(10, pairs2.scores());
        assertEquals(12, pairs3.scores());
        assertEquals(8, pairs4.scores());
        assertEquals(12, pairs5.scores());
        assertEquals(6, pairs6.scores());
        assertEquals(6, pairs7.scores());
        assertEquals(0, pairs8.scores());
    }

    @Test
    public void twoPairs() {
        YatzyTwoPairs twoPairs1 = new YatzyTwoPairs(3, 3, 5, 4, 5);
        YatzyTwoPairs twoPairs2 = new YatzyTwoPairs(3, 3, 5, 5, 5);
        YatzyTwoPairs twoPairs3 = new YatzyTwoPairs(1, 1, 2, 3, 3);
        YatzyTwoPairs twoPairs4 = new YatzyTwoPairs(1, 1, 2, 3, 4);
        YatzyTwoPairs twoPairs5 = new YatzyTwoPairs(1, 1, 2, 2, 2);

        assertEquals(16, twoPairs1.scores());
        assertEquals(16, twoPairs2.scores());
        assertEquals(8, twoPairs3.scores());
        assertEquals(0, twoPairs4.scores());
        assertEquals(6, twoPairs5.scores());

    }

    @Test
    public void ThreeOfAKind() {
        YatzyThreeOfKind threeOfKind1 = new YatzyThreeOfKind(5, 3, 5, 4, 5);
        YatzyThreeOfKind threeOfKind2 = new YatzyThreeOfKind(3, 3, 3, 3, 5);
        YatzyThreeOfKind threeOfKind3 = new YatzyThreeOfKind(3, 3, 3, 3, 3);
        YatzyThreeOfKind threeOfKind4 = new YatzyThreeOfKind(3, 3, 4, 5, 6);
        YatzyThreeOfKind threeOfKind5 = new YatzyThreeOfKind(3, 3, 3, 3, 1);

        assertEquals(15, threeOfKind1.scores());
        assertEquals(9, threeOfKind2.scores());
        assertEquals(9, threeOfKind3.scores());
        assertEquals(0, threeOfKind4.scores());
        assertEquals(9, threeOfKind5.scores());
    }

    @Test
    public void fourOfAKind() {

        YatzyFourOfAKind fourOfKind1 = new YatzyFourOfAKind(3, 3, 3, 3, 5);
        YatzyFourOfAKind fourOfKind2 = new YatzyFourOfAKind(5, 5, 5, 4, 5);
        YatzyFourOfAKind fourOfKind3 = new YatzyFourOfAKind(2, 2, 2, 2, 5);
        YatzyFourOfAKind fourOfKind4 = new YatzyFourOfAKind(2, 2, 2, 5, 5);
        YatzyFourOfAKind fourOfKind5 = new YatzyFourOfAKind(2, 2, 2, 2, 2);

        assertEquals(12, fourOfKind1.scores());
        assertEquals(20, fourOfKind2.scores());
        assertEquals(8, fourOfKind3.scores());
        assertEquals(0, fourOfKind4.scores());
        assertEquals(8, fourOfKind5.scores());
    }

    @Test
    public void smallStraight() {

        YatzySmallStraight smallStraight1 = new YatzySmallStraight(1, 2, 3, 4, 5);
        YatzySmallStraight smallStraight2 = new YatzySmallStraight(2, 3, 4, 5, 1);
        YatzySmallStraight smallStraight3 = new YatzySmallStraight(1, 2, 2, 4, 5);

        assertEquals(15, smallStraight1.scores());
        assertEquals(15, smallStraight2.scores());
        assertEquals(0, smallStraight3.scores());
    }

    @Test
    public void largeStraight() {

        YatzyLargeStraight largeStraight1 = new YatzyLargeStraight(6, 2, 3, 4, 5);
        YatzyLargeStraight largeStraight2 = new YatzyLargeStraight(2, 3, 4, 5, 6);
        YatzyLargeStraight largeStraight3 = new YatzyLargeStraight(1, 2, 2, 4, 5);

        assertEquals(20, largeStraight1.scores());
        assertEquals(20, largeStraight2.scores());
        assertEquals(0, largeStraight3.scores());
    }

    @Test
    public void fullHouse() {

        YatzyFullHouse fullHouse1 = new YatzyFullHouse(6, 2, 2, 2, 6);
        YatzyFullHouse fullHouse2 = new YatzyFullHouse(2, 3, 4, 5, 6);
        YatzyFullHouse fullHouse3 = new YatzyFullHouse(1, 1, 2, 2, 2);
        YatzyFullHouse fullHouse4 = new YatzyFullHouse(2, 2, 3, 3, 4);

        assertEquals(18, fullHouse1.scores());
        assertEquals(0, fullHouse2.scores());
        assertEquals(8, fullHouse3.scores());
        assertEquals(0, fullHouse4.scores());

    }

}

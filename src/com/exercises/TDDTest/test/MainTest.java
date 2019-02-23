import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PrimitiveIterator;

public class MainTest {


    @Test
    public void shouldReturnOneWhenNumberIsOne() {
        String result = Main.gameAnswerNumber(1);
        Assert.assertEquals("1",result);
    }

    @Test
    public void shouldReturnFizzWhenNumberIsThree() {
        String result = Main.gameAnswerFizz(3);
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsFive() {
        String result = Main.gameAnswerBuzz(5);
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsFifteen() {
        String result = Main.gameAnswerFizzBuzz(15);
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test
    public void shouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfThree() {
        for ( int number = 1; number<=100; number++){
            if (Main.multipleOfThree(number))
                Assert.assertEquals("Fizz" , Main.gameAnswerFizz(number));
        }
    }

    @Test
    public void shouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfFive() {
        for ( int number = 1; number<=100; number++){
            if (Main.multipleOfFive(number))
                Assert.assertEquals("Buzz" , Main.gameAnswerBuzz(number));
        }
    }

    @Test
    public void shouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfFifteen() {
        for ( int number = 1; number<=100; number++){
            if (Main.multipleOfFifteen(number))
                Assert.assertEquals("FizzBuzz" , Main.gameAnswerFizzBuzz(number));
        }
    }

    @Test
    public void shouldReturnFizzWhenNumberConsistOfThreeAtRight() {
        int number = 43;
        if(Main.consistOfNumberThreeAtRight(number))
            Assert.assertEquals("Fizz" , Main.gameAnswerFizz(number));

    }

    @Test
    public void shouldReturnFizzWhenNumberConsistOfThreeAtLeft() {
        int number = 34;
        if(Main.consistOfNumberThreeAtLeft(number))
            Assert.assertEquals("Fizz" , Main.gameAnswerFizz(number));

    }

    @Test
    public void shouldReturnBuzzWhenNumberConsistOfFiveAtLeft() {
        int number = 54;
        if (Main.consistOfNumberFiveAtLeft(number))
            Assert.assertEquals("Buzz", Main.gameAnswerBuzz(number));
    }

    @Test
    public void  shouldReturnFizzBuzzWhenNumberConsistOfFiveAtLeftAndMultipleOfThree() {
        int number = 51;
        if (Main.multipleOfThree(number) && Main.consistOfNumberFiveAtLeft(number))
            Assert.assertEquals("FizzBuzz", Main.gameAnswerFizzBuzz(number));
    }

    @Test
    public void  shouldReturnFizzBuzzWhenNumberConsistOfthreeAtLeftAndMultipleOfFive() {
        int number = 35;
        if (Main.multipleOfFive(number) && Main.consistOfNumberThreeAtLeft(number))
            Assert.assertEquals("FizzBuzz", Main.gameAnswerFizzBuzz(number));
    }

    @Test
    public void  shouldReturnFizzBuzzWhenNumberConsistOfFiveAtLeftAndThreeAtRight() {
        int number = 53;
        if (Main.consistOfNumberThreeAtRight(number) && Main.consistOfNumberFiveAtLeft(number))
            Assert.assertEquals("FizzBuzz", Main.gameAnswerFizzBuzz(number));
    }
}
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
    public void ShouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfThree() {
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (Main.multipleOfThree(givenNumber))
                Assert.assertEquals("Fizz" , Main.gameAnswerFizz(givenNumber));
        }
    }

    @Test
    public void ShouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfFive() {
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (Main.multipleOfFive(givenNumber))
                Assert.assertEquals("Buzz" , Main.gameAnswerBuzz(givenNumber));
        }
    }

    @Test
    public void ShouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfFifteen() {
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (Main.multipleOfFifteen(givenNumber))
                Assert.assertEquals("FizzBuzz" , Main.gameAnswerFizzBuzz(givenNumber));
        }
    }


}
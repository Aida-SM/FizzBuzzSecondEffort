import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PrimitiveIterator;

public class MainTest {

    private Main main;


    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void shouldReturnOneWhenNumberIsOne() {
        String result = main.gameAnswerNumber(1);
        Assert.assertEquals("1",result);
    }

    @Test
    public void shouldReturnFizzWhenNumberIsThree() {
        String result = main.gameAnswerFizz(3);
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsFive() {
        String result = main.gameAnswerBuzz(5);
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsFifteen() {
        String result = main.gameAnswerFizzBuzz(15);
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test
    public void ShouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfThree() {
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (givenNumber%3==0)
                Assert.assertEquals("Fizz" , main.gameAnswerFizz(givenNumber));
        }
    }

    @Test
    public void ShouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfFive() {
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (givenNumber%5==0)
                Assert.assertEquals("Buzz" , main.gameAnswerBuzz(givenNumber));
        }
    }

    @Test
    public void ShouldReturnFizzWhenNumbersBetweenZeroAndHundredAreMultipleOfFifteen() {
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (main.multipleOfFifteen(givenNumber))
                Assert.assertEquals("FizzBuzz" , main.gameAnswerFizzBuzz(givenNumber));
        }
    }


}
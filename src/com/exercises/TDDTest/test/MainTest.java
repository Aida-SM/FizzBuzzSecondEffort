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
        GameAnswer gameAnswer = new Fizz(3);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        Assert.assertEquals("Fizz",result.name());
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsFive() {
        GameAnswer gameAnswer = new Buzz(5);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        Assert.assertEquals("Buzz", result.name());
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsFifteen() {
        GameAnswer gameAnswer = new FizzBuzz(15);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        Assert.assertEquals("FizzBuzz" , result.name());
    }
}
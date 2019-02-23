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
        GameAnswer gameAnswer = new FizzBuzz(15);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        Assert.assertEquals("FizzBuzz" , result.name());
    }
}
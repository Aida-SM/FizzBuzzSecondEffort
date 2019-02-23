import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnOneWhenNumberIsOne() {
        Main main = new Main();
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
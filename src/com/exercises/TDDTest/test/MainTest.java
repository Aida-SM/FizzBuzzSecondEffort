import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void shouldReturnOneWhenNumberIsOne() {
        GameAnswer gameAnswer = new Number(1);
        String result = gameAnswer.getNumber();
        Assert.assertEquals("1",result);
    }


}
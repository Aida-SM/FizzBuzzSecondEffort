
public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public String gameAnswerNumber(int i) {
        GameAnswer gameAnswer = new Number(1);
        return gameAnswer.getNumber();

    }

    public String gameAnswerFizz(int givenNumber) {
        GameAnswer gameAnswer = new Fizz(3);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }

    public String gameAnswerBuzz(int givenNumber) {
        GameAnswer gameAnswer = new Buzz(5);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }

    public String gameAnswerFizzBuzz(int givenNumber) {
        GameAnswer gameAnswer = new FizzBuzz(15);
        return getFinalResult(gameAnswer);
    }

    private String getFinalResult(GameAnswer gameAnswer) {
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }
}

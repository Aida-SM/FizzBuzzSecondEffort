
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (givenNumber % 15 == 0)
                System.out.println(main.gameAnswerFizzBuzz(givenNumber));
            else if (givenNumber % 5 == 0)
                System.out.println(main.gameAnswerBuzz(givenNumber));
            else if (givenNumber % 3 == 0)
                System.out.println(main.gameAnswerFizz(givenNumber));
            else
                System.out.println(main.gameAnswerNumber(givenNumber));
        }


    }


    public String gameAnswerNumber(int i) {
        GameAnswer gameAnswer = new Number(1);
        return gameAnswer.getNumber();

    }

    public String gameAnswerFizz(int givenNumber) {
        GameAnswer gameAnswer = new Fizz(givenNumber);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }

    public String gameAnswerBuzz(int givenNumber) {
        GameAnswer gameAnswer = new Buzz(givenNumber);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }

    public String gameAnswerFizzBuzz(int givenNumber) {
        GameAnswer gameAnswer = new FizzBuzz(givenNumber);
        return getFinalResult(gameAnswer);
    }

    private String getFinalResult(GameAnswer gameAnswer) {
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }
}

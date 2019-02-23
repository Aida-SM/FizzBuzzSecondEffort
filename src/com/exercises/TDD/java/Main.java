
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (multipleOfFifteen(givenNumber))
                System.out.println(main.gameAnswerFizzBuzz(givenNumber));
            else if (givenNumber % 5 == 0)
                System.out.println(main.gameAnswerBuzz(givenNumber));
            else if (givenNumber % 3 == 0)
                System.out.println(main.gameAnswerFizz(givenNumber));
            else
                System.out.println(main.gameAnswerNumber(givenNumber));
        }


    }


    public static String gameAnswerNumber(int givenNumber) {
        GameAnswer gameAnswer = new Number(givenNumber);
        return gameAnswer.getNumber();

    }

    public static String gameAnswerFizz(int givenNumber) {
        GameAnswer gameAnswer = new Fizz(givenNumber);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }

    public static String gameAnswerBuzz(int givenNumber) {
        GameAnswer gameAnswer = new Buzz(givenNumber);
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }

    public static String gameAnswerFizzBuzz(int givenNumber) {
        GameAnswer gameAnswer = new FizzBuzz(givenNumber);
        return getFinalResult(gameAnswer);
    }

    private static String getFinalResult(GameAnswer gameAnswer) {
        AnswerStatus result = gameAnswer.getAnswerStatus();
        return result.name();
    }

    public static boolean multipleOfFifteen(int givennumber) {
        return givennumber % 15 == 0;
    }
}

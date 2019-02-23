
public class Main {

    public static void main(String[] args) {


        for ( int givenNumber = 1; givenNumber<=100; givenNumber++){
            if (multipleOfFifteen(givenNumber))
                System.out.println(gameAnswerFizzBuzz(givenNumber));
            else if (multipleOfFive(givenNumber) || consistOfNumberFiveAtLeft(givenNumber))
                System.out.println(gameAnswerBuzz(givenNumber));
            else if (multipleOfThree(givenNumber) || consistOfNumberThreeAtRight(givenNumber) || consistOfNumberThreeAtLeft(givenNumber))
                System.out.println(gameAnswerFizz(givenNumber));
            else
                System.out.println(gameAnswerNumber(givenNumber));
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

    public static boolean multipleOfFifteen(int givenNumber) {
        return givenNumber % 15 == 0;
    }

    public static boolean multipleOfFive(int givenNumber) {
        return givenNumber % 5 ==0;
    }

    public static boolean multipleOfThree(int givenNumber) {
        return givenNumber % 3 == 0;
    }

    public static boolean consistOfNumberThreeAtRight(int givenNumber) {
        return givenNumber % 10 == 3;
    }

    public static boolean consistOfNumberThreeAtLeft(int givenNumber) {
        return givenNumber / 10 == 3;
    }

    public static boolean consistOfNumberFiveAtLeft(int givenNumber) {
        return givenNumber / 10 == 5;
    }
}


public class Main {

    public static void main(String[] args) {


        for ( int number = 1; number<=100; number++){
            if (multipleOfFifteen(number))
                System.out.println(gameAnswerFizzBuzz(number));
            else if (multipleOfThree(number)&& consistOfNumberFiveAtLeft(number))
                System.out.println(gameAnswerFizzBuzz(number));
            else if (multipleOfFive(number)&& consistOfNumberThreeAtLeft(number))
                System.out.println(gameAnswerFizzBuzz(number));
            else if (consistOfNumberFiveAtLeft(number) && consistOfNumberThreeAtRight(number))
                System.out.println(gameAnswerFizzBuzz(number));
            else if (multipleOfFive(number) || consistOfNumberFiveAtLeft(number))
                System.out.println(gameAnswerBuzz(number));
            else if (multipleOfThree(number) || consistOfNumberThreeAtRight(number) || consistOfNumberThreeAtLeft(number))
                System.out.println(gameAnswerFizz(number));
            else
                System.out.println(gameAnswerNumber(number));
        }


    }


    public static String gameAnswerNumber(int givenNumber) {
        return Number.getNumber(givenNumber);

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

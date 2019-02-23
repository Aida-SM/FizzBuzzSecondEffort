public class FizzBuzz extends GameAnswer {
    public FizzBuzz(int number) {
        super(number);
    }

    @Override
    public AnswerStatus getAnswerStatus() {
        return AnswerStatus.FizzBuzz;
    }
}

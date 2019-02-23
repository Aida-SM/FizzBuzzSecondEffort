public class Buzz extends GameAnswer {
    public Buzz(int number) {
        super(number);
    }

    @Override
    public AnswerStatus getAnswerStatus() {
        return AnswerStatus.Buzz;
    }
}

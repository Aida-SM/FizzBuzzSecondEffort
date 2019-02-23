public class Number extends GameAnswer {

    private  GameAnswer gameAnswer;
    private int number;

    public Number(int number) {
        super(number);
    }

    @Override
    public AnswerStatus getAnswerStatus() {
        return null;
    }
}

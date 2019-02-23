public class Number extends GameAnswer {

    private  GameAnswer gameAnswer;
    private int number;

    public Number(int number) {
        super(number);
    }
    public String getNumber() {
        return String.valueOf(number);
    }
    @Override
    public AnswerStatus getAnswerStatus() {
        return null;
    }
}

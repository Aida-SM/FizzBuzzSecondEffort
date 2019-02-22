public class Fizz extends GameAnswer {
    private AnswerStatus answerStatus;
    public Fizz(int number) {
        super(number);
    }

    public void setAnswerStatus(AnswerStatus answerStatus){
        this.answerStatus = answerStatus;
    }
}

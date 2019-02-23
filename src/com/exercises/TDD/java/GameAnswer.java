public abstract class GameAnswer {
    private int number;

    public GameAnswer(int number) {
        this.number = number;
    }

    public abstract AnswerStatus getAnswerStatus();
}

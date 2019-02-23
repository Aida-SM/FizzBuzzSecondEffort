public class Fizz extends GameAnswer {

    public Fizz(int number) {
        super(number);
    }


    public AnswerStatus getAnswerStatus(){
        return AnswerStatus.Fizz;
    }

}

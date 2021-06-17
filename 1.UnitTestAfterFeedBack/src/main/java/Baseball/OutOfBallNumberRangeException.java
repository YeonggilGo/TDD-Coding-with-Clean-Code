package Baseball;

public class OutOfBallNumberRangeException extends IllegalArgumentException{
    public OutOfBallNumberRangeException() {
        super("Ball number must be between 1 and 9");
    }
}

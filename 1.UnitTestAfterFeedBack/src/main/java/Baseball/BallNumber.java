package Baseball;

import lombok.Getter;

@Getter
public class BallNumber {
    private int no;

    public BallNumber(int no) {
        ValidateBallNumber(no);
        this.no = no;
    }

    public boolean ValidateBallNumber(int num) {
        if (num > 9 || num < 1) {
            throw new OutOfBallNumberRangeException();
        }
        return true;
    }
}

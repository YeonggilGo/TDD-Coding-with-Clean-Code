package Baseball;

import lombok.Getter;

@Getter
public class BallNumber {
    private int no;

    public BallNumber(int no) {
        try {
            ValidateBallNumber(no);
            this.no = no;
        } catch (OutOfBallNumberRangeException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean ValidateBallNumber(int num) {
        if (num > 9 || num < 1) {
            throw new OutOfBallNumberRangeException();
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BallNumber that = (BallNumber) o;

        return no == that.no;
    }
}

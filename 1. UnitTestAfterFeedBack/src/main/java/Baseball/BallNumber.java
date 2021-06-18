package Baseball;

import lombok.Getter;

@Getter
public class BallNumber {
    private int no;

    public BallNumber(int no) {
        try {
            this.no = no;
            ValidateBallNumber();
        } catch (OutOfBallNumberRangeException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean ValidateBallNumber() {
        if (this.no > 9 || this.no < 1) {
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

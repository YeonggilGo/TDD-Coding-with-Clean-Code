package Baseball;

import lombok.Getter;

@Getter
public class Ball {
    private int position;
    private BallNumber ballNumber;

    public Ball(int position, int no) {
        this.position = position;
        this.ballNumber = new BallNumber(no);
    }

    public BallStatus play(Ball ball) {
        return BallStatus.NOTHING;
    }

}

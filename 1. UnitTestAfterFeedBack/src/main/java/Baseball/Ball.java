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
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }

        if (this.matchBall(ball)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBall(Ball ball) {
        return ball.getBallNumber().getNo() == ballNumber.getNo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (position != ball.position) return false;
        return ballNumber != null ? ballNumber.equals(ball.ballNumber) : ball.ballNumber == null;
    }
}

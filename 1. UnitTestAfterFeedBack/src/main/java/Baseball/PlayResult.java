package Baseball;

import lombok.Getter;

@Getter
public class PlayResult {
    private int strike;
    private int ball;

    public boolean isGameEnd() {
        return strike == 3;
    }

    public void report(BallStatus status) {
        if (status == BallStatus.STRIKE) this.strike += 1;
        if (status == BallStatus.BALL) this.ball += 1;
    }

    @Override
    public String toString() {
        return "PlayResult{" +
                "strike=" + strike +
                ", ball=" + ball +
                '}';
    }
}

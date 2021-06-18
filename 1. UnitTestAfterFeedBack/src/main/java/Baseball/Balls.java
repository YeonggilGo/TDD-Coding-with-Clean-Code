package Baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Balls {
    private List<Ball> answers;

    public Balls(List<Integer> balls) {
        List<Ball> tempBalls = new ArrayList<>();
        AtomicInteger i = new AtomicInteger();
        balls.stream()
                .forEach(ball -> tempBalls.add(new Ball(i.getAndIncrement(), ball)));
        this.answers = tempBalls;
    }

    public BallStatus play(Ball ball) {
        return answers.stream()
                .map(answer -> answer.play(ball))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(Balls balls) {
        PlayResult result = new PlayResult();
        answers.stream()
                .map(answer -> balls.play(answer))
                .filter(BallStatus::isNotNothing)
                .forEach(status -> result.report(status));
        return result;
    }

    public boolean ValidateBalls() {
        return answers.stream()
                .allMatch(answer -> answer.getBallNumber().ValidateBallNumber(answer.getBallNumber().getNo()))
                && answers.size() == 3;
    }
}

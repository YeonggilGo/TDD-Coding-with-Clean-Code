package Baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Balls {
    private List<Ball> answers;

    public Balls() {
        RandomNumbersGenerator generator = new RandomNumbersGenerator();
        this.answers = mapBalls(generator.generateRandomNumbers());
    }

    public Balls(List<Integer> ballNumbers) {
        this.answers = mapBalls(ballNumbers);
    }

    public List<Ball> mapBalls(List<Integer> ballNumbers) {
        List<Ball> tempBalls = new ArrayList<>();
        AtomicInteger i = new AtomicInteger();
        ballNumbers.stream()
                .forEach(ballNumber -> tempBalls.add(new Ball(i.getAndIncrement(), ballNumber)));
        return tempBalls;
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
                .allMatch(answer -> answer.getBallNumber().ValidateBallNumber())
                && answers.size() == 3;
    }
}

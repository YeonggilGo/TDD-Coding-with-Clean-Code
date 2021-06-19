package Baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void play_nothing() {
        PlayResult result = balls.play(new Balls(Arrays.asList(4, 5, 6)));
        assertThat(result.getStrike()).isEqualTo(0);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void play_1Strike_1Ball() {
        PlayResult result = balls.play(new Balls(Arrays.asList(1, 4, 2)));
        assertThat(result.getStrike()).isEqualTo(1);
        assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void play_3Strike() {
        PlayResult result = balls.play(new Balls(Arrays.asList(1, 2, 3)));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.isGameEnd()).isTrue();
    }

    @Test
    void nothing() {
        assertThat(balls.play(new Ball(1, 4))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        assertThat(balls.play(new Ball(0, 2))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        assertThat(balls.play(new Ball(0, 1))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ValidateBalls() {
        assertThat(balls.ValidateBalls()).isTrue();
    }
}

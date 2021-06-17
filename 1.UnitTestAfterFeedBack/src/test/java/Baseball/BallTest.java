package Baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(0, 4);
    }

    @Test
    void nothing() {
        assertThat(ball.play(new Ball(1, 5))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        assertThat(ball.play(new Ball(1, 4))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        assertThat(ball.play(new Ball(0, 4))).isEqualTo(BallStatus.STRIKE);
    }


}

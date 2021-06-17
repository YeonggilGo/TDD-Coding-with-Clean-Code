package Baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(1, 4);
    }

    @Test
    void nothing() {
        assertThat(ball.play(new Ball(2, 5))).isEqualTo(BallStatus.NOTHING);
    }
}

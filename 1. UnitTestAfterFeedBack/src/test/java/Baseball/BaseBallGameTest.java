package Baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallGameTest {
    BaseBallGame game;

    @BeforeEach
    void setUp() {
        game = new BaseBallGame(new Balls(Arrays.asList(1, 2, 3)));
    }

    @Test
    void game() {
        List<Balls> userInputs = new ArrayList<>();
        userInputs.addAll(Arrays.asList(
                new Balls(Arrays.asList(3, 4, 5)),
                new Balls(Arrays.asList(3, 4, 2)),
                new Balls(Arrays.asList(3, 2, 1)),
                new Balls(Arrays.asList(1, 3, 2)),
                new Balls(Arrays.asList(1, 2, 3))
        ));
        PlayResult result = game.play(userInputs);
        assertThat(result.isGameEnd()).isTrue();
    }
}

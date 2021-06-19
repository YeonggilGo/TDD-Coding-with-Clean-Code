package Baseball;

import java.util.List;
import java.util.Optional;

public class BaseBallGame {
    private Balls answers;
    private int stat = 1;

    public BaseBallGame(Balls answers) {
        this.answers = answers;
    }

    public PlayResult play(List<Balls> userInputs) {
        Optional<PlayResult> res = null;
        while (stat == 1) {
            res = userInputs.stream()
                    .map(input -> answers.play(input))
                    .dropWhile(playResult -> !playResult.isGameEnd())
                    .findFirst();
            res.ifPresent(playResult -> {
                System.out.println("3Strike!!!\nEnter 1 if you wanna play the game again, or 2 if you wanna quit the game.");
                stat = 2;
            });
        };
        return res.orElse(new PlayResult());
    }
}

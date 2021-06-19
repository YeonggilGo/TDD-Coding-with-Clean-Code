package Baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersGenerator {
    Random random;

    public RandomNumbersGenerator() {
        this.random = new Random();
    }

    public List<Integer> generateRandomNumbers() {
        List<Integer> result = new ArrayList<>();
        while (result.size() < 3) {
            int randInt = random.nextInt(8) + 1;
            if (result.contains(randInt)) continue;
            result.add(randInt);
        }
        return result;
    }
}

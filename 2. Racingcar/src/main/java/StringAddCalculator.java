import java.util.Arrays;

public class StringAddCalculator {
    public static int splitAndSum(String input) {
        if (input == null || input.isEmpty())
            return 0;

        return Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .reduce(0, (fir, sec) -> fir + sec);
    }

}

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {
    public static int splitAndSum(String input) {
        if (input == null || input.isEmpty())
            return 0;

        return mySplit(input)
                .stream()
                .reduce(0, (fir, sec) -> fir + sec);
    }

    public static List<Integer> mySplit(String input) {
        Pattern customDeli = Pattern.compile("^//.\n");
        Matcher matcher = customDeli.matcher(input);
        String allDeli = "[:,]";
        if (matcher.find()) {
            allDeli = "[" + String.valueOf(matcher.group().charAt(2)) + ":,]";
            input = matcher.replaceFirst("");
        }
        return Arrays.stream(input.split(allDeli))
                .map(Integer::parseInt)
                .filter(StringAddCalculator::isNotNegative)
                .collect(Collectors.toList());
    }

    public static boolean isNotNegative(int num) {
        if (num < 0) {
            throw new RuntimeException();
        }
        return true;
    }
}

package study;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StrikeBallTest {
    StrikeBall sb;

    @BeforeEach
    void setUp() {
        sb = new StrikeBall();
    }

    @Test
    void startgame() {

    }

    @Test
    void generateRandomNumbers() {
        int[] actual = sb.generateRandomNumbers();
        Arrays.stream(actual)
                .forEach(num -> System.out.println(num));
    }

    @Test
    void checkAnswer() {
        int[] result = {2, 0};
        String actual = sb.checkAnswer(result);
        System.out.println(actual);
        System.out.println(sb.success);
    }

    @Test
    void getAnswer() {
        int[] answer = sb.generateRandomNumbers();
        int[] input = sb.generateRandomNumbers();
        int[] actual = sb.getAnswer(input, answer);
        for (int i = 0; i < 3; i++)
            System.out.println(input[i] + " " + answer[i]);
        Arrays.stream(actual)
                .forEach(num -> System.out.println(num));
    }

    @AfterEach
    void tearDown() {
        sb = null;
    }
}
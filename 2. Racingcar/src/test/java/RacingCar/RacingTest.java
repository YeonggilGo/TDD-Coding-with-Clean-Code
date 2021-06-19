package RacingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingTest {
    Cars cars;
    Racing racing;
    @BeforeEach
    void setUp() {
        cars = new Cars("cobi,tom,cruel");
        racing = new Racing(5, cars);
    }

    @Test
    void racingTest() {
        racing.race();
    }
}

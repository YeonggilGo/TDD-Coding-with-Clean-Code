package RacingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars("cobi,tom,cruel");
    }

    @Test
    void randomlySelectCars() {
        List<Car> selectedCars = cars.selectRandomly(2);
        assertThat(selectedCars.size()).isEqualTo(2);
    }
}

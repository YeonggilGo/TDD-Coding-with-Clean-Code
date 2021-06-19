package RacingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        Cars selectedCars = cars.selectRandomly(2);
        assertThat(selectedCars.getCars().size()).isEqualTo(2);
    }

    @Test
    void driveSelectedCars() {
        Cars selectedCars = cars.selectRandomly(2);
        selectedCars.drive();
        assertThat(selectedCars.checkMovingForward()).isTrue();
    }

    @Test
    void getWinners() {
        cars.getCars().get(0).drive();
        assertThat(cars.getWinners()).contains(cars.getCars().get(0));
    }
}

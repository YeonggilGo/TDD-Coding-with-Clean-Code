package RacingCar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("cobi");
    }

    @Test
    void newCar() {
        assertThat(car).isInstanceOf(Car.class);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void DriveCar() {
        car.drive();
        assertThat(car.checkPositionEqualsTwo()).isTrue();
    }
}

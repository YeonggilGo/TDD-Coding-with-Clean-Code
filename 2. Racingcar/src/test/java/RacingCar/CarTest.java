package RacingCar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void newCar() {
        Car tempCar = new Car("cobi");
        assertThat(tempCar).isInstanceOf(Car.class);
        assertThat(tempCar.getPosition()).isEqualTo(0);
    }
}

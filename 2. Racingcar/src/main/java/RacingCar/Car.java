package RacingCar;

import lombok.Getter;

@Getter
public class Car {
    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }
}

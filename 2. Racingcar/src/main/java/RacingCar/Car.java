package RacingCar;

import lombok.Getter;

@Getter
public class Car {
    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
        ValidateCarName();
        this.position = 0;
    }

    public void ValidateCarName() {
        if (this.name.length() > 5) {
            throw new IllegalArgumentException("Name must be shorter than 5 char.");
        }
    }

    public void drive() {
        this.position += 1;
    }
}

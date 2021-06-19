package RacingCar;

import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class Cars {
    private List<Car> cars;

    public Cars(String names) {
        List<String> namesList = Arrays.asList(names.split(","));
        List<Car> cars = new ArrayList<>();
        for (String name : namesList) {
            cars.add(new Car(name));
        }
        this.cars = cars;
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars selectRandomly(int numberOfCarsToSelect) {
        Random random = new Random();
        Set<Car> carSet = new HashSet<>();
        while (carSet.size() < numberOfCarsToSelect) {
            int randInt = random.nextInt(cars.size());
            carSet.add(cars.get(randInt));
        }
        return new Cars(carSet.stream().collect(Collectors.toList()));
    }

    public void drive() {
        for(Car car: cars) {
            car.drive();
        }
    }

    public boolean checkMovingForward() {
        return cars.stream()
                .map(car -> car.checkPositionEqualsOne())
                .allMatch(Boolean::booleanValue);
    }
}

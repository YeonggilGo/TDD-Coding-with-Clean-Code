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

    public Cars() {
        this.cars = new ArrayList<>();
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
        for (Car car : cars) {
            car.drive();
        }
    }

    public void drive(List<Integer> selectedIndexOfCars) {
        for (int index: selectedIndexOfCars){
            cars.get(index).drive();
        }
    }

    public boolean checkMovingForward() {
        return cars.stream()
                .map(car -> car.checkPositionEqualsTwo())
                .allMatch(Boolean::booleanValue);
    }

    public List<Car> getWinners() {
        int farthestPosition = cars.stream()
                .map(Car::getPosition)
                .reduce(0, (fir, sec) -> fir > sec ? fir : sec);
        return cars.stream()
                .filter(car -> car.getPosition() == farthestPosition)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return cars.toString();
    }
}

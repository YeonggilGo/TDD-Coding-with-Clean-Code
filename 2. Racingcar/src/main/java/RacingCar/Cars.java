package RacingCar;

import java.util.*;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;

    public Cars(String names) {
        List<String> namesList = Arrays.asList(names.split(","));
        List<Car> cars = new ArrayList<>();
        for (String name: namesList){
            cars.add(new Car(name));
        }
        this.cars = cars;
    }

    public List<Car> selectRandomly(int numberOfCarsToSelect) {
        Random random = new Random();
        Set<Car> carSet = new HashSet<>();
        while (carSet.size() < numberOfCarsToSelect) {
            int randInt = random.nextInt(cars.size());
            carSet.add(cars.get(randInt));
        }
        return carSet.stream().collect(Collectors.toList());
    }
}

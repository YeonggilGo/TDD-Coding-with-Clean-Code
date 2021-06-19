package RacingCar;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public void printRoundResultView(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.printf("%s : %s\n", car.getName(), repeat(car.getPosition(), "-"));
        }
        System.out.println("\n");
    }

    public void printFinalResultView(Cars cars) {
        List<Car> winnersList = cars.getWinners();
        String winnersNames = winnersList.stream()
                .map(Car::getName)
                .collect(Collectors.toList())
                .toString();
        System.out.println(winnersNames + "is the final winners!");
    }

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }
}

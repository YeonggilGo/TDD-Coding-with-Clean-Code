package RacingCar;

public class Racing {
    private int round;
    private Cars cars;

    public Racing(int round, Cars cars) {
        this.round = round;
        this.cars = cars;
    }

    public void race() {
        InputView.printInputView(cars, round);
        System.out.println("실행 결과");
        ResultView.printRoundResultView(cars);
        for (int i = 0; i < round; i++) {
            Cars selectedCars = cars.selectRandomly(2);
            selectedCars.drive();
            ResultView.printRoundResultView(cars);
        }
        ResultView.printFinalResultView(cars);
    }
}

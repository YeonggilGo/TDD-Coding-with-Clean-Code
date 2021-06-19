package RacingCar;

public class InputView {
    public static void printInputView() {
        System.out.println("Enter the names of cars that participate in the race.(Names are separated by the comma(,)).\n");
    }

    public static void printInputView(Cars cars, int round) {
        System.out.println(new StringBuilder()
                .append("Enter the names of cars that participate in the race.(Names are separated by the comma(,)).\n")
                .append(cars.toString()).append("\n")
                .append("Enter the how many rounds to try\n")
                .append(round).append("\n"));
    }
}

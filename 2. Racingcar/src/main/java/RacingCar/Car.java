package RacingCar;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Car {
    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }
}

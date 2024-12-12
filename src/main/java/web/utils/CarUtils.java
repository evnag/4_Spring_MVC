package web.utils;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CarUtils {

    private static final List<Car> cars = new ArrayList<>();

    private static final int NUM_CARS = 5;
    private static final int MIN_CARS_NUM = 1000;

    public static List<Car> buildCars() {
        if (cars.isEmpty()) {
            IntStream.range(0, NUM_CARS)
                    .forEach(n -> cars.add(new Car((long) (MIN_CARS_NUM + n + 1), "Model" + (n + 1), n + 1)));
        }
        return cars;
    }
}

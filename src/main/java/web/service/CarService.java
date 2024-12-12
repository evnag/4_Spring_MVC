package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.utils.CarUtils;

import java.util.Collections;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = CarUtils.buildCars();

    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    public List<Car> getCarsByCount(Integer count) {
        List<Car> list;
        if (count == null || count >= 5 || count == 0) {
            list = getAllCars();
        } else {
            list = Collections.unmodifiableList(cars.subList(0, count));
        }
        return list;
    }
}

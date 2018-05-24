package com.mws.cars.services.impl;

import com.mws.cars.model.Car;
import com.mws.cars.services.CarService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getInitialCars() {
        Car car1 = new Car();
        car1.setBrand("Mazda");
        car1.setModel("CX-5");
        car1.setEngineVolume(1.8);
        Car car2 = new Car();
        car2.setBrand("Honda");
        car2.setModel("Accord");
        car2.setEngineVolume(2.0);
        return Arrays.asList(car1, car2);
    }
}

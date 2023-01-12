package hiber.service;

import hiber.model.Car;

import java.util.List;

public interface UserService {
    void add(Car car);

    List<Car> listCar();

    List<Car> createCar();

    List<Car> carList(int count);
}
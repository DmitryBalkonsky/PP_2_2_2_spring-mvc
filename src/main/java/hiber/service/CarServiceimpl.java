package hiber.service;

import hiber.dao.CarDao;
import hiber.dao.CarDaoimpl;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceimpl implements CarService {

    @Autowired
    private CarDao carDao;

    public void add(Car car) {
        carDao.add(car);
    }

    public List<Car> listCar() {
        return carDao.listCar();
    }

    @Override
    public List<Car> createCar() { return carDao.createCar(); }

    public List<Car> carList(int count) {
        CarDao carDao1 = new CarDaoimpl();
        return carDao1.carList(count);
    }
}
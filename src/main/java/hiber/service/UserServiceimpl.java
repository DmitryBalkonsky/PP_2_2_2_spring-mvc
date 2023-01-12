package hiber.service;

import hiber.dao.UserDao;
import hiber.dao.UserDaoimpl;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void add(Car car) {
        userDao.add(car);
    }

    public List<Car> listCar() {
        return userDao.listCar();
    }

    @Override
    public List<Car> createCar() { return userDao.createCar(); }

    public List<Car> carList(int count) {
        UserDao userDao1 = new UserDaoimpl();
        return userDao1.carList(count);
    }
}
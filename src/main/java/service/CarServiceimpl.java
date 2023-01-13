package service;

import model.Car;
import jakarta.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceimpl implements CarService {

    private SessionFactory sessionFactory;


    public void add(Car car) { sessionFactory.getCurrentSession().save(car); }

    @Override
    public List<Car> listCar() {
        TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("from Car");
        return query.getResultList();
    }


    @Override
    public List<Car> createCar() {
        Car car = new Car("Tesla", "S", "White");
        Car car1 = new Car("Tesla", "T", "Black");
        Car car2 = new Car("BMW", "X3", "Yellow");
        Car car3 = new Car("LADA", "2114", "Wet asphalt");
        Car car4 = new Car("Ural", "4120", "Moss");
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        return carList;
    }

    @Override
    public List<Car> carList(int count) {
        return createCar().subList(0, count);
    }
}
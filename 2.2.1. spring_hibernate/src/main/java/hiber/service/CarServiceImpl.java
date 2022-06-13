package hiber.service;

import hiber.dao.CarDaoImpl;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CarServiceImpl implements CarService{

    @Autowired
    CarDaoImpl carDao;

    @Transactional
    @Override
    public void add(Car car) {
        carDao.add(car);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Car> listOfCars() {
        return carDao.listOfCars();
    }
}

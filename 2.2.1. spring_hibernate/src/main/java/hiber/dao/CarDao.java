package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface CarDao {


    void add(Car car);

    List<Car> listOfCars();

}

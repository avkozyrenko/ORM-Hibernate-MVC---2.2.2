package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> createCarList() {
        Car car1 = new Car(1, "Mazda", 3);
        Car car2 = new Car(2, "BMW", 7);
        Car car3 = new Car(3, "Opel", 2);
        Car car4 = new Car(3, "Renault", 1);
        Car car5 = new Car(3, "Porsche", 8);

        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        return list;
    }

    @Override
    public List<Car> getCarList(int count) {
        List<Car> list1 = null;
        list1 = createCarList().stream().limit(count).collect(Collectors.toList());
        return list1;
    }
}

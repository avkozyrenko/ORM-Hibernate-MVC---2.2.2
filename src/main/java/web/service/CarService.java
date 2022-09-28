package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> showCarList(int count);

    public List<Car> createCarList();
}

package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> showCarList(int count);
    public List<Car> createCarList();
}
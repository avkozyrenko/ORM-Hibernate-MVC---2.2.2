package web.controller;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model) {

        List<Car> carsList =carService.createCarList();
        model.addAttribute("carsTable", carService.showCarList(count.orElse(carsList.size())));

        return "cars";
    }

}

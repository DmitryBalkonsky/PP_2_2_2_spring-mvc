package web.controller;

import model.Car;
import service.CarService;
import service.CarServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        CarService userService = new CarServiceimpl();
        if (count >= 5){
            count = 5;
        }
        List<Car> list = userService.carList(count);
        model.addAttribute("cars", list);
        return "cars";
    }
}
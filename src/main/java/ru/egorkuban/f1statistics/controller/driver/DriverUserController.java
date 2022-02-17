package ru.egorkuban.f1statistics.controller.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.egorkuban.f1statistics.service.driver.DriverUserService;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/championship")
public class DriverUserController {
    private final DriverUserService driverUserService;
    @GetMapping("/drivers")
    public String getAllDrivers (Model model){
        model.addAttribute("drivers",driverUserService.getAllDrivers());
        return "all-drivers";
    }
}

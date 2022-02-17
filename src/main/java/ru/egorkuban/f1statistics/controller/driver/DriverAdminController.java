package ru.egorkuban.f1statistics.controller.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.egorkuban.f1statistics.service.driver.DriverAdminService;
import ru.egorkuban.f1statistics.to.dto.driver.DriverWithСompleteInformation;
import ru.egorkuban.f1statistics.to.request.TeamRequest;

@Controller
@RequestMapping("api/v1/championship/admin")
@RequiredArgsConstructor
public class DriverAdminController {
    private final DriverAdminService driverAdminService;
    @GetMapping("/drivers/{driverId}/")
    public String formDriver(@ModelAttribute("driverInfo") DriverWithСompleteInformation driver,
                             @PathVariable String driverId) {

        return "/drivers-with-complete-info";

    }

    @PostMapping("/drivers/{driverId}/update-driver/")
    public String updateDriver(@ModelAttribute("driverInfo") DriverWithСompleteInformation driver,
                               @PathVariable Long driverId) {
        driverAdminService.updateDriver(driver,driverId);
        return "redirect:/api/v1/championship/drivers";
    }
}

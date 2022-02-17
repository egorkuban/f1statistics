package ru.egorkuban.f1statistics.controller.team;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.egorkuban.f1statistics.service.team.TeamAdminService;
import ru.egorkuban.f1statistics.to.request.DriverRequest;
import ru.egorkuban.f1statistics.to.request.TeamRequest;
import ru.egorkuban.f1statistics.to.response.TeamResponse;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/championship/admin")
public class TeamAdminController {
    private final TeamAdminService teamAdminService;

    @GetMapping("team/new")
    public String newTeam(@ModelAttribute("teamRequest") TeamRequest teamRequest) {

        return "/add-new-team";

    }

    @PostMapping("team/new/")
    public String createTeam(@ModelAttribute("teamRequest") TeamRequest teamRequest) {
        teamAdminService.createTeam(teamRequest);
        return "redirect:/api/v1/championship/team";
    }

    @GetMapping("team/{teamId}/drivers/new")
    public String newDrivers(@ModelAttribute("driverRequest") DriverRequest driverRequest,
                             @PathVariable Long teamId) {

        return "/add-driver-new";

    }

    @PostMapping("team/{teamId}/drivers/new/")
    public String createDriver(@ModelAttribute("driverRequest") DriverRequest driverRequest,
                               @PathVariable Long teamId) {
        teamAdminService.createDriver(driverRequest, teamId);
        return "redirect:/api/v1/championship/team";
    }


//    @PostMapping("team/{teamId}/")
//    public ResponseEntity<TeamResponse> updateTeam(RequestBody TeamRequest, @PathVariable Long teamId) {
//        return null;
//    }

    @GetMapping("team/{teamId}")
    String deleteDriverTeam(@PathVariable Long teamId) {
        teamAdminService.deleteTeam(teamId);
        return "redirect:/api/v1/championship/team";
    }
}

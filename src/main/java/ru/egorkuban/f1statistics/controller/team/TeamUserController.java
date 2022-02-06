package ru.egorkuban.f1statistics.controller.team;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.egorkuban.f1statistics.service.team.TeamUserService;
import ru.egorkuban.f1statistics.to.dto.team.TeamDto;
import ru.egorkuban.f1statistics.to.response.DriverResponse;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("api/v1/championship/")
public class TeamUserController {
    private final TeamUserService teamUserService;

    @GetMapping("/teams/{teamId}/drivers/")
    public String getAllTeamDrivers(@PathVariable Long teamId,Model model) {
        {
            final List<DriverResponse> allTeamWithDrivers = teamUserService.getAllTeamDrivers(teamId);
            model.addAttribute("drivers",allTeamWithDrivers);

            return "players-info";

        }
    }

    @GetMapping("/teams")
    public String getAllTeam(Model model) {
        List<TeamDto> teams = teamUserService.getAllTeam();
        model.addAttribute("teams",teams);
        return "team-list";
    }
    @GetMapping("/team/{teamId}/")
    public ResponseEntity<TeamDto> getTeam(@PathVariable Long teamId) {
        return  new ResponseEntity<>(teamUserService.getTeamById(teamId),HttpStatus.OK);

    }
}

package ru.egorkuban.f1statistics.controller.team;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.egorkuban.f1statistics.service.team.TeamAdminService;
import ru.egorkuban.f1statistics.to.request.DriverRequest;
import ru.egorkuban.f1statistics.to.request.TeamRequest;
import ru.egorkuban.f1statistics.to.response.DriverResponse;
import ru.egorkuban.f1statistics.to.response.TeamResponse;
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/championship/admin/")
public class TeamAdminController {
    private final TeamAdminService teamAdminService;
    @PostMapping("team/new")
    public ResponseEntity<TeamResponse> createTeam(@RequestBody TeamRequest teamRequest) {
        return new ResponseEntity<>(teamAdminService.createTeam(teamRequest), HttpStatus.CREATED);
    }

    @PostMapping("team/{teamId}/drivers/new")
    public ResponseEntity<DriverResponse> createDriver(@RequestBody DriverRequest driverRequest,
                                                       @PathVariable Long teamId) {
        return new ResponseEntity<>(teamAdminService.createDriver(driverRequest, teamId), HttpStatus.CREATED);
    }
    @PostMapping("team/{teamId}/change")
    public ResponseEntity<TeamResponse> updateTeam (RequestBody TeamRequest, @PathVariable Long teamId){
        return null;
    }

    @PostMapping("team/{teamId}/drivers/{driversId}/delete")
    public ResponseEntity<String> deleteDriverTeam(@PathVariable Long driversId, @PathVariable String teamId){
        teamAdminService.deleteDriverTeam(driversId);
        return new ResponseEntity<>("Driver with id= " + driversId + " kicked off the team",HttpStatus.OK);
    }
}

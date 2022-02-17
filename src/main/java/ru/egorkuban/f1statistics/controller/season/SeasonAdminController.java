package ru.egorkuban.f1statistics.controller.season;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.egorkuban.f1statistics.service.team.TeamAdminService;
import ru.egorkuban.f1statistics.to.request.SeasonRequest;
import ru.egorkuban.f1statistics.to.response.SeasonResponse;

@RestController
@RequestMapping("api/v1/championship/admin/")
@RequiredArgsConstructor
public class SeasonAdminController {
    private final TeamAdminService teamAdminService;

    @PostMapping("api/v1/championship/admin/season/new")
    public ResponseEntity<SeasonResponse> createSeason(@RequestBody SeasonRequest seasonRequest) {
        return new ResponseEntity<SeasonResponse>(HttpStatus.CREATED);
    }
}

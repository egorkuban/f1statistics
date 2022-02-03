package ru.egorkuban.f1statistics.controller.grandprix;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.egorkuban.f1statistics.to.request.GrandPrixRequest;
import ru.egorkuban.f1statistics.to.response.GrandPrixResponse;

@RestController
@RequestMapping("api/v1/championship/")
public class GrandPrixController {
    @PostMapping("admin/grandprix/new")
    public ResponseEntity<GrandPrixResponse> createGrandPrix(@RequestBody GrandPrixRequest grandPrixRequest) {
        return new ResponseEntity<GrandPrixResponse>(HttpStatus.CREATED);
    }
}

package ru.egorkuban.f1statistics.to.response;

import lombok.Getter;
import lombok.Setter;
import ru.egorkuban.f1statistics.model.Driver;
import ru.egorkuban.f1statistics.model.Team;

import java.time.LocalDate;

@Getter
@Setter
public class GrandPrixResponse {
    Long id;
    int year;
    LocalDate dateStart;
    LocalDate dateEnd;
    String country;
    String autodrome;
    String grandPrixName;
    Driver winnerDriver;
    Team winnerTeam;
}

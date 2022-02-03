package ru.egorkuban.f1statistics.to.response;

import lombok.Getter;
import lombok.Setter;
import ru.egorkuban.f1statistics.model.GrandPrix;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class SeasonResponse {
    Long id;
    List<GrandPrix> grandsPrix;
    int year;
    LocalDate dateStart;
    LocalDate dateEnd;
    int countGrandsPrix;
}

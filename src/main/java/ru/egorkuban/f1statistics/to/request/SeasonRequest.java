package ru.egorkuban.f1statistics.to.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SeasonRequest {
    int year;
    LocalDate dateStart;
    LocalDate dateEnd;
}

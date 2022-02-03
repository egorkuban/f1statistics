package ru.egorkuban.f1statistics.to.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class GrandPrixRequest {
    int year;
    LocalDate dateStart;
    LocalDate dateEnd;
    String country;
    String autodrome;
    String grandPrixName;

}

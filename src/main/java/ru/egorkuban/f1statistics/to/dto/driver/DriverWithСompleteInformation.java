package ru.egorkuban.f1statistics.to.dto.driver;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class DriverWithСompleteInformation {
    DriverTo driver;
    int totalPoints;
    int totalWinsInSeason;
    int totalPoles;
    boolean worldChampions;
    boolean winnerInSeason;
}

package ru.egorkuban.f1statistics.to.dto.team;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class TeamWithoutDriversDto {
    Long id;
    String name;
    String country;
    String teamChief;
    String engineManufacturer;
    String chassis;
    int constructorsCups;
    int victories;
}

package ru.egorkuban.f1statistics.to.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TeamRequest {
    String name;
    String country;
    String teamChief;
    String engineManufacturer;
    String chassis;
    int constructorsCups;
    int victories;
}

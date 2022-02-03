package ru.egorkuban.f1statistics.to.dto.team;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class TeamDto {
    Long id;
    String name;
    String country;
    String teamChief;
    List<String> drivers;
}

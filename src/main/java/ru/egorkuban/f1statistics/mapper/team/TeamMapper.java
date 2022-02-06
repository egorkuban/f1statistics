package ru.egorkuban.f1statistics.mapper.team;

import ru.egorkuban.f1statistics.model.Team;
import ru.egorkuban.f1statistics.to.dto.team.TeamDto;

import java.util.stream.Collectors;

public class TeamMapper {
    public static final TeamMapper INSTANCE = new TeamMapper();

    public TeamDto mapToTeamDto (Team team){
        return new TeamDto()
                .setId(team.getId())
                .setName(team.getName())
                .setCountry(team.getCountry())
                .setTeamChief(team.getTeamChief())
                .setDrivers(team.getDrivers().stream()
                        .map(driver -> {
                            return driver.getFirstName() + " " + driver.getLastName();
                        })
                        .collect(Collectors.toList()));
    }
}

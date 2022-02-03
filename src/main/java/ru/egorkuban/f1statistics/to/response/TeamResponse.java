package ru.egorkuban.f1statistics.to.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.egorkuban.f1statistics.to.dto.team.TeamDto;

@Getter
@Setter
@Accessors(chain = true)
public class TeamResponse {
    TeamDto teamDto;
}

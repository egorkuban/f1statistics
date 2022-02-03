package ru.egorkuban.f1statistics.service.team;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.egorkuban.f1statistics.mapper.DriverMapper;
import ru.egorkuban.f1statistics.mapper.team.TeamMapper;
import ru.egorkuban.f1statistics.model.Team;
import ru.egorkuban.f1statistics.repository.TeamRepository;
import ru.egorkuban.f1statistics.to.dto.team.TeamDto;
import ru.egorkuban.f1statistics.to.response.DriverResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamUserService {

    private final TeamRepository teamRepository;

    public List<DriverResponse> getAllTeamDrivers(Long teamId) {

        return teamRepository.findById(teamId)
                .orElseThrow(() -> new IllegalArgumentException("Team with id= " + teamId + "NOT FOUND"))
                .getDrivers().stream()
                .map(DriverMapper.INSTANCE::mapToDriverResponse)
                .collect(Collectors.toList());
    }

    public List<TeamDto> getAllTeam() {
        return teamRepository.findAll().stream()
                .map(TeamMapper.INSTANCE::mapToTeamDto)
                .collect(Collectors.toList());

    }

    public TeamDto getTeamById(Long teamId) {
        Team team = teamRepository.findById(teamId)
                .orElseThrow(() -> new IllegalArgumentException("Team with id= " + teamId + "NOT FOUND"));
        return TeamMapper.INSTANCE.mapToTeamDto(team);

    }
}

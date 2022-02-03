package ru.egorkuban.f1statistics.service.team;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.egorkuban.f1statistics.mapper.DriverMapper;
import ru.egorkuban.f1statistics.mapper.team.TeamMapper;
import ru.egorkuban.f1statistics.model.Driver;
import ru.egorkuban.f1statistics.model.Team;
import ru.egorkuban.f1statistics.repository.DriverRepository;
import ru.egorkuban.f1statistics.repository.TeamRepository;
import ru.egorkuban.f1statistics.to.request.DriverRequest;
import ru.egorkuban.f1statistics.to.request.TeamRequest;
import ru.egorkuban.f1statistics.to.response.DriverResponse;
import ru.egorkuban.f1statistics.to.response.TeamResponse;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamAdminService {
    private final DriverRepository driverRepository;
    private final TeamRepository teamRepository;

    @Transactional
    public TeamResponse createTeam(TeamRequest teamRequest) {
        Team team = new Team()
                .setName(teamRequest.getName())
                .setCountry(teamRequest.getCountry())
                .setTeamChief(teamRequest.getTeamChief())
                .setDrivers(Collections.emptyList());
        teamRepository.save(team);

        return new TeamResponse()
                .setTeamDto(TeamMapper.INSTANCE.mapToTeamDto(team));
    }

    @Transactional
    public DriverResponse createDriver(DriverRequest driverRequest, Long teamId) {
        Team team = teamRepository.getById(teamId);
        Driver driver = new Driver()
                .setAge(driverRequest.getAge())
                .setBeginIn(driverRequest.getBeginIn())
                .setCountry(driverRequest.getCountry())
                .setFirstName(driverRequest.getFirstName())
                .setLastName(driverRequest.getLastName())
                .setNumber(driverRequest.getNumber())
                .setTeam(team)
                .setTotalPoints(0)
                .setTotalPoles(0)
                .setTotalWinsInSeason(0)
                .setWinner(false)
                .setWorldChampion(false);
        driverRepository.save(driver);

        return DriverMapper.INSTANCE.mapToDriverResponse(driver);
    }

    @Transactional
    public void deleteDriverTeam(Long driversId) {
        Driver driver = driverRepository.findById(driversId)
                        .orElseThrow(()-> new IllegalArgumentException("Not found driver"));
        driverRepository.delete(driver);
    }
}

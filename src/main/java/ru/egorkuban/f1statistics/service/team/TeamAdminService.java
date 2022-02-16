package ru.egorkuban.f1statistics.service.team;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.egorkuban.f1statistics.model.Driver;
import ru.egorkuban.f1statistics.model.Team;
import ru.egorkuban.f1statistics.repository.DriverRepository;
import ru.egorkuban.f1statistics.repository.TeamRepository;
import ru.egorkuban.f1statistics.to.request.DriverRequest;
import ru.egorkuban.f1statistics.to.request.TeamRequest;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class TeamAdminService {
    private final DriverRepository driverRepository;
    private final TeamRepository teamRepository;

    @Transactional
    public void createTeam(TeamRequest teamRequest) {
        Team team = new Team()
                .setName(teamRequest.getName())
                .setCountry(teamRequest.getCountry())
                .setTeamChief(teamRequest.getTeamChief())
                .setDrivers(Collections.emptyList())
                .setChassis(teamRequest.getChassis())
                .setEngine_manufacturer(teamRequest.getEngineManufacturer())
                .setConstructorsCups((int) teamRequest.getConstructorsCups())
                .setVictories((int) teamRequest.getVictories());
        teamRepository.save(team);
    }

    @Transactional
    public void createDriver(DriverRequest driverRequest, Long teamId) {
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
    }

    @Transactional
    public void deleteTeam(Long teamId) {
        Team team = teamRepository.findById(teamId)
                .orElseThrow(()->new IllegalArgumentException("Team with id= " + teamId + " Not Found"));
        teamRepository.delete(team);
    }
}

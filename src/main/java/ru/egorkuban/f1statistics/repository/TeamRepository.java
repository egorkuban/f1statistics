package ru.egorkuban.f1statistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.egorkuban.f1statistics.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query("SELECT DISTINCT t FROM Team  t LEFT JOIN FETCH t.drivers ORDER BY t.id")
    List<Team> findAllTeams();

    @Query("SELECT t FROM Team  t  JOIN FETCH t.drivers where t.id = ?1")
    Optional<Team> findByIdTeam(Long id);

}

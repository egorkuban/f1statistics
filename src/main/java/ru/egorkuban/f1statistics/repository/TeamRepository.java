package ru.egorkuban.f1statistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.egorkuban.f1statistics.model.Team;

public interface TeamRepository extends JpaRepository<Team,Long> {

}

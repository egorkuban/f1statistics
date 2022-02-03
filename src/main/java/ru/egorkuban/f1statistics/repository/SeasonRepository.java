package ru.egorkuban.f1statistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.egorkuban.f1statistics.model.Season;

public interface SeasonRepository extends JpaRepository<Season,Long> {
}

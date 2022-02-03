package ru.egorkuban.f1statistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.egorkuban.f1statistics.model.GrandPrix;

public interface GrandPrixRepository extends JpaRepository<GrandPrix,Long> {
}

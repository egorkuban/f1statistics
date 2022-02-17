package ru.egorkuban.f1statistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.egorkuban.f1statistics.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}

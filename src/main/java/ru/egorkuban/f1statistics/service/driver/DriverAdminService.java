package ru.egorkuban.f1statistics.service.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.egorkuban.f1statistics.mapper.driver.DriverMapper;
import ru.egorkuban.f1statistics.model.Driver;
import ru.egorkuban.f1statistics.repository.DriverRepository;
import ru.egorkuban.f1statistics.to.dto.driver.DriverWithСompleteInformation;

import javax.persistence.Table;

@Service
@RequiredArgsConstructor
public class DriverAdminService {
    private final DriverRepository driverRepository;

    @Transactional
    public void updateDriver(DriverWithСompleteInformation driver, Long driverId){
        Driver driverFromBd = driverRepository.getById(driverId);
        driverRepository.save(DriverMapper.INSTANCE.mapToDriver(driverFromBd,driver));
    }
}

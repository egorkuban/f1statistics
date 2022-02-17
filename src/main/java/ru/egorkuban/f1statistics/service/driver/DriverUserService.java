package ru.egorkuban.f1statistics.service.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ru.egorkuban.f1statistics.mapper.driver.DriverMapper;
import ru.egorkuban.f1statistics.repository.DriverRepository;
import ru.egorkuban.f1statistics.to.dto.driver.DriverWithСompleteInformation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DriverUserService {
    private final DriverRepository driverRepository;

    public List<DriverWithСompleteInformation> getAllDrivers (){
        return driverRepository.findAll().stream()
                .map(DriverMapper.INSTANCE::mapToDriverWithСompleteInformation)
                .sorted(Comparator.comparing(DriverWithСompleteInformation::getTotalPoints, Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }


}

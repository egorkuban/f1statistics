package ru.egorkuban.f1statistics.mapper;

import ru.egorkuban.f1statistics.model.Driver;
import ru.egorkuban.f1statistics.to.response.DriverResponse;

public class DriverMapper {
    public static final DriverMapper INSTANCE = new DriverMapper();

    public DriverResponse mapToDriverResponse(Driver driver) {
        return new DriverResponse()
                .setFirstName(driver.getFirstName())
                .setLastName(driver.getLastName())
                .setAge(driver.getAge())
                .setCountry(driver.getCountry())
                .setBeginIn(driver.getBeginIn())
                .setTeam(driver.getTeam().getName())
                .setNumber(driver.getNumber())
                .setId(driver.getId());
    }

}

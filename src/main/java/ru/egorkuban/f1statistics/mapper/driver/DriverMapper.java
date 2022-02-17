package ru.egorkuban.f1statistics.mapper.driver;

import ru.egorkuban.f1statistics.model.Driver;
import ru.egorkuban.f1statistics.to.dto.driver.DriverTo;
import ru.egorkuban.f1statistics.to.dto.driver.DriverWithСompleteInformation;

public class DriverMapper {
    public static final DriverMapper INSTANCE = new DriverMapper();

    public DriverTo mapToDriverResponse(Driver driver) {
        return new DriverTo()
                .setFirstName(driver.getFirstName())
                .setLastName(driver.getLastName())
                .setAge(driver.getAge())
                .setCountry(driver.getCountry())
                .setBeginIn(driver.getBeginIn())
                .setTeam(driver.getTeam().getName())
                .setNumber(driver.getNumber())
                .setId(driver.getId());
    }

    public Driver mapToDriver(Driver driver,
                              DriverWithСompleteInformation driverWithСompleteInformation) {
        return driver
                .setTotalPoints(driverWithСompleteInformation.getTotalPoints())
                .setTotalPoles(driverWithСompleteInformation.getTotalPoles())
                .setTotalWinsInSeason(driverWithСompleteInformation.getTotalWinsInSeason())
                .setWorldChampion(driverWithСompleteInformation.isWorldChampions())
                .setWinner(driverWithСompleteInformation.isWinnerInSeason());
    }

    public DriverWithСompleteInformation mapToDriverWithСompleteInformation(Driver driver) {
        return new DriverWithСompleteInformation()
                .setDriver(mapToDriverResponse(driver))
                .setTotalPoints(driver.getTotalPoints())
                .setTotalPoles(driver.getTotalPoles())
                .setTotalWinsInSeason(driver.getTotalWinsInSeason())
                .setWorldChampions(driver.isWorldChampion())
                .setWinnerInSeason(driver.isWinner());
    }

}

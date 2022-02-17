package ru.egorkuban.f1statistics.to.dto.driver;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class DriverTo {
    Long id;
    String firstName;
    String lastName;
    String country;
    String team;
    int age;
    int number;
    int beginIn;
}

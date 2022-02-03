package ru.egorkuban.f1statistics.to.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.egorkuban.f1statistics.model.Team;

@Getter
@Setter
@Accessors(chain = true)
public class DriverResponse {
    Long id;
    String firstName;
    String lastName;
    int age;
    String team;
    int number;
    String country;
    int beginIn;
}


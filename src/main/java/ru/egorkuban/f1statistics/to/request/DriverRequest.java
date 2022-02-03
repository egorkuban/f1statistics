package ru.egorkuban.f1statistics.to.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverRequest {
    String firstName;
    String lastName;
    int age;
    String team;
    int number;
    String country;
    int beginIn;
}

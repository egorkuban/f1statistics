package ru.egorkuban.f1statistics.to.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverRequest {
    String firstName;
    String lastName;
    String country;
    int age;
    int number;
    int beginIn;
}

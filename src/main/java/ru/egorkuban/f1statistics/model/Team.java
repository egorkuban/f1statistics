package ru.egorkuban.f1statistics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Accessors(chain = true)
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "team_chief", nullable = false)
    private String teamChief;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    private List<Driver> drivers;
}
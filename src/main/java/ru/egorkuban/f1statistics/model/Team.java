package ru.egorkuban.f1statistics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "public", name = "team")
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
    @Column(name = "engine_manufacturer", nullable = false)
    private String engine_manufacturer;
    @Column(name = "chassis", nullable = false)
    private String chassis;
    @Column(name = "constructors_cups",nullable = false)
    private int constructorsCups;
    @Column(name = "victories", nullable = false)
    private int victories;

    @OneToMany(mappedBy = "team")
    private List<Driver> drivers;
}
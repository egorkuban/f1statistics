package ru.egorkuban.f1statistics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
@Entity
@Table(schema = "public", name = "drivers")
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column (name = "age", nullable = false)
    private int age;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @Column (name = "number", nullable = false)
    private int number;

    @Column (name = "country", nullable = false)
    private String country;

    @Column (name = "total_points", nullable = false)
    private int totalPoints;

    @Column (name = "total_wins_in_season", nullable = false)
    private int totalWinsInSeason;

    @Column (name = "total_poles", nullable = false)
    private int totalPoles;

    @Column (name = "begin_in", nullable = false)
    private int beginIn;

    @Column (name = "world_champion", nullable = false)
    private boolean worldChampion = false;

    @Column (name = "winner", nullable = false)
    private boolean winner = false;

}

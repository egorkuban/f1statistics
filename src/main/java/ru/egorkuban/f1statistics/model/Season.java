package ru.egorkuban.f1statistics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(schema = "public", name = "season")
@Setter
@Getter
@NoArgsConstructor
@Accessors(chain = true)
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "year", nullable = false)
    int year;
    @Column(name = "date_start", nullable = false)
    LocalDate dateStart;
    @Column(name = "date_end", nullable = false)
    LocalDate dateEnd;
    @Column(name = "count_grand_prix", nullable = false)
    int countGrandPrix;

    @OneToMany(mappedBy = "season",cascade = CascadeType.ALL)
    List<GrandPrix> grandPrixList;
}

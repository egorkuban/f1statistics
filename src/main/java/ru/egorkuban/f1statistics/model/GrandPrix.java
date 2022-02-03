package ru.egorkuban.f1statistics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(schema = "public", name = "grand_prix")
@NoArgsConstructor
@Accessors(chain = true)
public class GrandPrix {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "season_id")
    Season season;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "year", nullable = false)
    private Integer year;
    @Column(name = "date_start", nullable = false)
    private LocalDate dateStart;
    @Column(name = "date_end", nullable = false)
    private LocalDate dateEnd;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "auto_drome", nullable = false)
    private String autodrome;
    @Column(name = "grand_prix_name", nullable = false)
    private String grandPrixName;
//    @OneToMany(mappedBy = "drivers", orphanRemoval = true, cascade = CascadeType.ALL)
//    private List< Driver> prizeWinners;
//    @OneToMany(mappedBy = "team", orphanRemoval = true, cascade = CascadeType.ALL)
//    private List<Team> winnerTeam;
}

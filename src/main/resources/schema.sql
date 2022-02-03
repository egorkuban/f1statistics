DROP TABLE IF EXISTS grand_prix;
DROP TABLE IF EXISTS drivers;
DROP TABLE IF EXISTS team;
DROP TABLE IF EXISTS season;



CREATE TABLE season
(
    id               BIGSERIAL PRIMARY KEY NOT NULL,
    year             BIGINT                NOT NULL,
    date_start       DATE                  NOT NULL,
    date_end         DATE                  NOT NULL,
    count_grand_prix BIGINT                NOT NULL
);
CREATE TABLE team
(
    id         BIGSERIAL PRIMARY KEY NOT NULL,
    name       varchar(255)          NOT NULL,
    country    varchar(255)          NOT NULL,
    team_chief varchar(255)          NOT NULL
);
CREATE TABLE drivers
(
    id                   BIGSERIAL PRIMARY KEY NOT NULL,
    first_name           varchar(255)          NOT NULL,
    last_name            varchar(255)          NOT NULL,
    age                  BIGINT                NOT NULL,
    team_id              BIGINT                NOT NULL,
    number               BIGINT                NOT NULL,
    country              varchar(255)          NOT NULL,
    total_points         BIGINT                NOT NULL,
    total_wins_in_season BIGINT                NOT NULL,
    total_poles          BIGINT                NOT NULL,
    begin_in             BIGINT                NOT NULL,
    world_champion       BOOLEAN               NOT NULL,
    winner               BOOLEAN               NOT NULL,
    FOREIGN KEY (team_id) REFERENCES team ON DELETE CASCADE
);

CREATE TABLE grand_prix
(
    id              BIGSERIAL PRIMARY KEY NOT NULL,
    year            BIGINT                NOT NULL,
    date_start      DATE                  NOT NULL,
    date_end        DATE                  NOT NULL,
    country         varchar(255)          NOT NULL,
    auto_drome      varchar(255)          NOT NULL,
    grand_prix_name varchar(255)          NOT NULL,
    season_id       BIGINT                NOT NULL,
    prize_winner_id BIGINT                not null,
    winner_team_id  BIGINT                NOT NULL,
    FOREIGN KEY (season_id) REFERENCES season ON DELETE CASCADE,
    FOREIGN KEY (prize_winner_id) REFERENCES drivers ON DELETE CASCADE,
    FOREIGN KEY (winner_team_id) REFERENCES team ON DELETE CASCADE

);








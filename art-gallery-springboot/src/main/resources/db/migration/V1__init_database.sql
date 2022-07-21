CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE artists (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    first_name VARCHAR,
    last_name VARCHAR
);

CREATE TABLE works (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    title VARCHAR,
    creation_date VARCHAR,
    description VARCHAR,
    artist_id INTEGER REFERENCES artists(id) NOT NULL
);

CREATE TABLE exhibitions (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    description VARCHAR
)
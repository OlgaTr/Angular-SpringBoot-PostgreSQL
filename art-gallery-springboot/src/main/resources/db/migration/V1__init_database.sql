CREATE SEQUENCE hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE collections (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    description VARCHAR
);
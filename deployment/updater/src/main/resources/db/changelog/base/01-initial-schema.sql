--liquibase formatted sql
--changeset mboisnard:01-initial-schema logicalFilePath:fixed splitStatements:false runInTransaction:false runOnChange:true

-- Cellar

CREATE TABLE IF NOT EXISTS public.cellar(
    id VARCHAR(24) NOT NULL PRIMARY KEY,
    owner_id VARCHAR(24) NOT NULL,
    name VARCHAR(100) NOT NULL,
    location_city VARCHAR(200) NOT NULL,
    location_country VARCHAR(100) NOT NULL,
    location_country_code VARCHAR(2) NOT NULL,
    location_latitude DOUBLE PRECISION NOT NULL,
    location_longitude DOUBLE PRECISION NOT NULL,
    modified TIMESTAMP NOT NULL
);

CREATE INDEX IF NOT EXISTS cellar_owner_id_idx
    ON public.cellar (owner_id);


-- User

CREATE TABLE IF NOT EXISTS public.user(
    id VARCHAR(24) NOT NULL PRIMARY KEY,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    birthdate DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(50) NOT NULL,
    lastConnection TIMESTAMP,
    enabled BOOLEAN NOT NULL DEFAULT FALSE,
    modified TIMESTAMP NOT NULL
);

CREATE INDEX IF NOT EXISTS user_email_idx
    ON public.user (email);

-- Role

CREATE TABLE IF NOT EXISTS public.role(
    user_id VARCHAR(24) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY(user_id) REFERENCES public.user(id) ON DELETE CASCADE
);

CREATE UNIQUE INDEX IF NOT EXISTS user_id_authority_idx
    ON public.role (user_id, authority);
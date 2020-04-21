-- Database: jaegers

-- DROP DATABASE jaegers;

CREATE TABLE jaegers (
     id         SERIAL PRIMARY KEY,
     modelName  TEXT,
     mark       TEXT,
     height     DOUBLE PRECISION,
     weight     DOUBLE PRECISION,
     status     TEXT,
     origin     TEXT,
     launch     DATE,
     kaijuKill  INTEGER
);
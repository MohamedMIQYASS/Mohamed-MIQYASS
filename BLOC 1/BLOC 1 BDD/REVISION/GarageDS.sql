CREATE DATABASE GarageDS;


CREATE TABLE Client (
    idClient INT,
    nom VARCHAR(20),
    prenom VARCHAR(20),
    ville VARCHAR(20),
    pays VARCHAR(20),
    date_creation DATE,
    PRIMARY KEY (idClient)
);

INSERT INTO Client (idClient, nom, prenom, ville, pays, date_creation)
VALUES
    (1, 'Villiers', 'Jérome', 'Paris', 'France', '2026-04-01'),
    (2, 'Han', 'Xian', 'Shangai', 'Chine', '2014-11-02'),
    (3, 'Smith', 'John', 'Wellington', 'Nouvelle-Zélande', '2001-07-15'),
    (4, 'Dos Santos', 'Luis', 'Quito', 'Équateur', '2006-12-09'),
    (5, 'Jaffar', 'Marwan', 'Sanaa', 'Yemen', '2024-12-16');

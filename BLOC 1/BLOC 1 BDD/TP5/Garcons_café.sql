CREATE TABLE CAFE (
    Num_cafe INT,
    enseigne VARCHAR(100),
    Rue VARCHAR(150),
    Cp INT,
    Ville VARCHAR(100),
    telephone VARCHAR(20),

    PRIMARY KEY(Num_cafe)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

CREATE TABLE COURSE (
    datecourse DATE,
    heuredepart TIME,
    circuit VARCHAR(150),

    PRIMARY KEY(datecourse)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

CREATE TABLE GARCONS (
    numdossier INT,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    datenaissance DATE,
    num_cafe INT,
    cp INT,

    PRIMARY KEY(numdossier, num_cafe),
    FOREIGN KEY (num_cafe) REFERENCES CAFE(Num_cafe)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

CREATE TABLE PARTICIPE (
    numdossier INT,
    datecourse DATE,
    place INT,

    PRIMARY KEY(numdossier, datecourse),
    FOREIGN KEY (numdossier) REFERENCES GARCONS(numdossier),
    FOREIGN KEY (datecourse) REFERENCES COURSE(datecourse)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

-- INSERTIONS

INSERT INTO CAFE (Num_cafe, enseigne, Rue, Cp, Ville, telephone) VALUES
(1, 'La Halle', '1 place de la halle', 45000, 'Orléans', '0254432801'),
(2, 'La Halte', '58 rue Condorcet', 45100, 'Orléans La Source', '0284621476'),
(3, 'La Rotonde', '102 rue Victor Hugo', 45160, 'Olivet', '0238542424'),
(4, 'L''alien Café', '8 rue royale', 45000, 'Orléans', '0254432802'),
(5, 'Le Maryland', '1 place du mail', 41000, 'Blois', '0238445784'),
(6, 'Les Mousquetaires', '1 rue de la république', 37000, 'Tours', NULL);

INSERT INTO COURSE (datecourse, heuredepart, circuit) VALUES
('2004-12-31', '14:00:00', 'ville historique'),
('2005-01-17', '16:00:00', 'sur les mails');

INSERT INTO GARCONS (numdossier, nom, prenom, datenaissance, Num_cafe, CP) VALUES
(1, 'ALBERT', 'Jacques', '1982-12-15', 6, 45000),
(2, 'DUBONNET', 'Jérôme', '1989-08-05', 3, 45160),
(3, 'TITGOUT', 'Justin', '1975-10-02', 2, 45800),
(4, 'ARAMIS', 'Heliazar', '1960-04-05', 6, 45100),
(5, 'GONTIER', 'Pierre', '1970-12-06', 2, 45800),
(6, 'BOURDIN', 'Louis', '1971-01-01', 2, 45800);

INSERT INTO PARTICIPE (numdossier, datecourse, place) VALUES
(1, '2004-12-31', 2),
(1, '2005-01-17', NULL),
(2, '2004-12-31', 4),
(2, '2005-01-17', NULL),
(3, '2004-12-31', 3),
(3, '2005-01-17', NULL),
(4, '2004-12-31', 1),
(4, '2005-01-17', NULL),
(5, '2004-12-31', 5),
(5, '2005-01-17', NULL);

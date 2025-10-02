CREATE TABLE HABITANT (
    nom VARCHAR(100),
    adresse VARCHAR(150),
    date_naissance DATE,
    rang VARCHAR(50),

    PRIMARY KEY(nom)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

CREATE TABLE MENHIR (
    nromen INT,
    hauteur INT,
    poids INT,
    prix FLOAT,
    dateachmen DATE,
    prixvente FLOAT,
    nom VARCHAR(100) NULL,

    PRIMARY KEY(nromen),
    FOREIGN KEY (nom) REFERENCES HABITANT(nom)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

CREATE TABLE FONCTION (
    rang VARCHAR(50),
    agemini INT,
    agemaxi INT,

    PRIMARY KEY(rang)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

CREATE TABLE POISSON (
    espece VARCHAR(100),
    prixkilo FLOAT,
    origine VARCHAR(50),

    PRIMARY KEY(espece)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

CREATE TABLE MANGE (
    nom VARCHAR(100),
    espece VARCHAR(100),
    dateachpoi DATE,
    nbkilo INT,

    PRIMARY KEY(nom, espece),
    FOREIGN KEY (nom) REFERENCES HABITANT(nom),
    FOREIGN KEY (espece) REFERENCES POISSON(espece)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_bin;

-- INSERT HABITANT
INSERT INTO HABITANT (nom, adresse, date_naissance, rang) VALUES
('Abracourcix', 'place de la mairie', '1955-01-04', 'chef'),
('Agecanonix', 'rue de Gergovie', '1900-11-01', 'retraité'),
('Assurancetourix', 'grand chêne', '1958-01-04', 'barde'),
('Astérix', 'grande rue', '1963-02-19', 'guerrier'),
('Avorenfix', 'rue de Lutèce', '1956-03-07', 'guerrier'),
('Barbiturix', 'rue d''Helvétie', '1964-03-09', 'apothicaire'),
('Bonnemine', 'place de la mairie', '1940-02-11', 'femme au foyer'),
('Céloïnamérix', 'place des Goths', '1961-02-17', 'guerrier'),
('Cétautomatix', 'rue de Gergovie', '1956-12-06', 'guerrier'),
('Emmesdoszix', 'grande rue', '1967-12-30', 'guerrier'),
('Fantastix', 'rue de Lutèce', '1969-06-08', 'guerrier'),
('Goudurix', 'rue des Bretons', '1972-03-17', 'charron'),
('Histérix', 'grande rue', '1975-02-17', 'guerrier'),
('Léonardevincix', 'rue de Lutèce', '1965-03-05', 'peintre'),
('Magix', 'rue d''Helvétie', '1968-12-15', 'barbier'),
('Marketingmix', 'place de la mairie', '1966-06-06', 'représentant'),
('Mirifix', 'place des Goths', '1967-03-05', 'guerrier'),
('Modélix', 'rue de Gergovie', '1969-12-10', 'guerrier'),
('Obélix', 'rue de Gergovie', '1962-07-10', 'guerrier'),
('Ordralphabétix', 'rue des sangliers', '1935-11-21', 'poissonnier'),
('Panoramix', 'grande hutte', '1940-12-24', 'druide'),
('Unix', 'grande rue', '1966-09-28', 'animateurdesix');

-- INSERT FONCTION (agemaxi corrigés)
INSERT INTO FONCTION (rang, agemini, agemaxi) VALUES
('animateurdesix', 18, 45),
('apothicaire', 30, 65),
('barbier', 18, 65),
('barde', 30, 80),
('charron', 18, 65),
('chef', 40, 65),
('druide', 60, 99),
('femme au foyer', 16, NULL),
('forgeron', 25, 60),
('guerrier', 20, 45),
('peintre', 18, 60),
('poissonnier', 25, 65),
('représentant', 18, 60),
('retraité', 60, NULL);

-- INSERT POISSON
INSERT INTO POISSON (espece, prixkilo, origine) VALUES
('bar', 8.00, 'mer'),
('barbot', 6.00, 'mer'),
('brochet', 12.00, 'douce'),
('carpe', 6.00, 'douce'),
('hareng', 1.00, 'mer'),
('lieu', 3.00, 'mer'),
('lotte', 4.00, 'mer'),
('morue', 2.00, 'mer'),
('rascasse', 4.00, 'mer'),
('sardine', 7.00, 'mer'),
('sole', 15.00, 'mer'),
('thon', 10.00, 'mer'),
('truite', 15.00, 'douce');

-- INSERT MANGE
INSERT INTO MANGE (nom, espece, dateachpoi, nbkilo) VALUES
('Astérix', 'hareng', '1994-01-03', 1),
('Astérix', 'morue', '1994-12-01', 1),
('Astérix', 'truite', '1994-01-04', 2),
('Bonnemine', 'brochet', '1994-01-04', 1),
('Bonnemine', 'lieu', '1994-01-04', 1),
('Bonnemine', 'lotte', '1994-01-04', 2),
('Bonnemine', 'sardine', '1994-01-04', 1),
('Goudurix', 'bar', '1994-01-04', 4),
('Magix', 'morue', '1994-01-03', 7),
('Mirifix', 'sardine', '1994-01-04', 3),
('Mirifix', 'thon', '1994-01-03', 4),
('Obélix', 'morue', '1994-08-01', 3),
('Obélix', 'thon', '1994-01-03', 9),
('Obélix', 'truite', '1994-10-01', 4),
('Ordralphabétix', 'truite', '1994-01-03', 8),
('Ordralphabétix', 'hareng', '1994-05-01', 8),
('Ordralphabétix', 'morue', '1994-10-01', 1),
('Unix', 'morue', '1994-01-04', 1);

-- INSERT MENHIR (clé primaire sur nromen, nom nullable OK)
INSERT INTO MENHIR (nromen, hauteur, poids, prix, dateachmen, prixvente, nom) VALUES
(1, 4, 10, 85.00, '1990-01-04', 80.00, 'Astérix'),
(2, 3, 9, 75.00, '1990-12-23', 70.00, 'Cétautomatix'),
(3, 5, 12, 95.00, '1991-01-04', 90.00, 'Panoramix'),
(4, 1, 3, 20.00, NULL, NULL, NULL),
(5, 7, 17, 105.00, NULL, NULL, NULL),
(6, 2, 4, 30.00, '1991-12-20', 60.00, 'Assurancetourix'),
(7, 2, 5, 120.00, NULL, NULL, NULL),
(8, 1, 4, 45.00, '1994-01-04', 43.00, 'Goudurix'),
(9, 3, 17, 94.00, '1994-01-04', 85.00, 'Bonnemine'),
(10, 2, 10, 56.00, '1994-01-04', 55.00, 'Panoramix');

 DROP DATABASE IF EXISTS MIQYASS_DBMIAM;
 CREATE DATABASE IF NOT EXISTS MIQYASS_DBMIAM;
 USE MIQYASS_DBMIAM;
# -----------------------------------------------------------------------------
#       TABLE : CLIENT

CREATE TABLE IF NOT EXISTS CLIENT
 (
   ID_CLIENT INT PRIMARY KEY  AUTO_INCREMENT,
   NOM CHAR(32) NOT NULL  ,
   PRENOM CHAR(32) NOT NULL,
   MAIL CHAR(50) NOT NULL,
   VILLE CHAR(32)  
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : COMMANDE

CREATE TABLE IF NOT EXISTS COMMANDE
 (
   ID_CMD INT PRIMARY KEY  AUTO_INCREMENT,
   ID_CLIENT INT NOT NULL  ,
   DETAILS VARCHAR(100) NULL, 
   ANNEE BIGINT(4)  NULL  
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : PRODUIT

CREATE TABLE IF NOT EXISTS PRODUIT
 (
   ID_PROD INT PRIMARY KEY  AUTO_INCREMENT,
   LIBELLE CHAR(32) NOT NULL  ,
   PRIX DECIMAL(5,2) NOT NULL
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : EMPLOYE

CREATE TABLE IF NOT EXISTS EMPLOYE
 (
   ID_EMP INT PRIMARY KEY  AUTO_INCREMENT,
   NOM CHAR(32) NOT NULL  ,
   PRENOM CHAR(32) NOT NULL  ,
   POSTE VARCHAR (100) NULL  
 ) ;

# -----------------------------------------------------------------------------
#       TABLE : PRIME annuelle

CREATE TABLE IF NOT EXISTS PRIME
 (
   ID_PRIME INT PRIMARY KEY  AUTO_INCREMENT,
   ID_EMP INT NOT NULL  ,
   MONTANT DECIMAL(7,2) NOT NULL,
   ANNEE BIGINT(4)  NULL  
 ) ;


INSERT INTO `client` (`NOM`,`PRENOM`,`MAIL`, `VILLE`) VALUES
('DUPONT', 'Jean',  'jdupont@aol.fr',  'CHARTRES'),
( 'LEBLANC', 'Eric', 'leblacn.eric@free.fr',  'PARIS 13E'),
( 'RICHET', 'Margot',  'margot.richet@orange.fr',  'MAINVILLIERS'),
( 'LEBLANC', 'Sonia',  'sleblanc@hotmail.com', 'CHARTRES'),
( 'SAGE', 'Denise', 'denisette45@sfr.fr',  'ORLEANS');


INSERT INTO `COMMANDE` (`ID_CLIENT`,`DETAILS`,`ANNEE`) VALUES
(1, '3000 bonbons à la menthe',  2014),
(1, '2000 mars chocobon',  2014),
(1, '1200 sucette au caramel',  2014),
(1, '3500 bonbons à la menthe',  2016),
(1, '2200 mars chocobon',  2016),
(1, '1300 sucette au caramel',  2016),
(2, '3000 bonbons à la menthe',  2014),
(2, '2000 mars chocobon',  2014),
(2, '1200 sucette au caramel',  2014),
(2, '3500 bonbons à la menthe',  2016),
(2, '2200 mars chocobon',  2016),
(2, '1300 sucette au caramel',  2016);


INSERT INTO `PRODUIT` (`LIBELLE`,`PRIX`) VALUES
('bonbons à la menthe', 0.20),
('mars chocobon',  0.35),
('sucette au caramel',  0.12),
('bonbons à l anis',  0.17);


INSERT INTO `EMPLOYE` (`NOM`,`PRENOM`,`POSTE`) VALUES
('CASSARD', 'Bernard',  'BIG BOSS'),
('CASSARD', 'Jacqueline',  'ASSISTANTE DU BIG BOSS'),
( 'GAMARD', 'Franck', 'APRRENTI RH'),
( 'RICHET', 'Margot',   'VENDEUSE'),
( 'LEBLANC', 'Sonia',   'VENDEUSE');

INSERT INTO `PRIME` (`ID_EMP`,`MONTANT`,`ANNEE`) VALUES
(1, 10000,  2020),
(2, 5000,  2020),
( 3, 200, 2020),
( 4, 1000,   2020),
( 5, 1200,  2020),
(1, 12000,  2021),
(2, 7000,  2021),
( 3, 400, 2021),
( 4, 1200,   2021),
( 5, 1400,  2021);



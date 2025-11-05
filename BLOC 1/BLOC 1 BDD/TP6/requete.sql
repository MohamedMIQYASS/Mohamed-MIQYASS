-- Liste des produits commandés (identifiant).

select IDPRODUIT FROM PRODUITS;

-- Affichez les contacts des fournisseurs. 

select NOMCONTACT FROM fournisseur;

-- Liste des clients avec toutes leurs informations 

select * FROM CLIENT;

-- Liste des expéditeurs (numéros) responsables de la livraison d’une commande

select TEL FROM expediteur NATURAL JOIN commande;

-- Liste des catégories.

select NOMCAT as catégories from categorie;

-- Liste des commandes (numéros) avec l’expéditeur n°3 (indiquez l’identifiant).

select NUMCDE as numéros , IDEXPEDITEUR as identifiant FROM commande where IDEXPEDITEUR =3;

-- Liste des clients (id) ayant passé une commande

select IDCLI as id FROM commande;

-- Liste des lignes de commandes avec quantité entre 10 et 30

select * from commande natural join detailcde where QUANTITE between 10 and 30;

-- Liste des clients (Nom, cp, ville) qui habitent une ville dont le nom commence par B ainsi que ceux dont le nom commence par T.

select nom , CODEPOSTAL as cp , ville from client where ville LIKE 'B%' or ville LIKE 'T%';

-- Liste des produits (référence, nom) vendus par le fournisseur n°12

select IDPRODUIT as reference , NOMPROD as nom FROM produits where IDFOURNISSEUR =12;

-- Liste des commandes passées en septembre 2018

select * from commande where YEAR(DATECDE) = "2018" and MONTH(DATECDE) ="09";

-- Liste des commandes à livrer en septembre 2018 triées en commençant par les commandes à livrer en premier.

select * from commande where YEAR(DATECDE) = "2018" and MONTH(DATECDE) ="09" order by YEAR(DATECDE) and MONTH(DATECDE);

-- Liste des produits (Nom du Produit,Reference du Produit) classés par fournisseurs ( NumFour décroissant). Pour chaque fournisseur, ils seront classés par référence de produit.

select NOMPROD as nom_du_produit , IDPRODUIT as reference_produit , IDFOURNISSEUR as NumFour from produits order by IDFOURNISSEUR desc, IDPRODUIT;

-- Liste des clients de France du département Loiret (le code postal commence par 45) triés par ville.














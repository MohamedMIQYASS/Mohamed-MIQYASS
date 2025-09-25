-- REQUETES

-- Lister tous les coureurs et leur pays

select numeroCoureur , NomCoureur , NomPays
from COUREURS natural join PAYS;

-- Lister tous les coureurs français

select numeroCoureur , NomCoureur
from COUREURS natural join PAYS
where NomPays = 'France';

-- Lister tous les temps de l’étape n°2

select * from TEMPS
where numeroEtape = 2;

-- Quel est le meilleur temps ? Comment utiliser la requête précédente pour trouver ce résultat ?

select min(TempsRealise) from TEMPS;

-- Lister tous les coureurs dont les noms/prénom contiennent le mots ‘Ja’

select * from COUREURS
where nom or prenom LIKE '%Ja%';

-- Lister les étapes dont la distance dépasse 150km

select * from ETAPES
where NbKM > 150;




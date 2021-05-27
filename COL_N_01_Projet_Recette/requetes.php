<?php
require_once("connexxionbase.php");

function getEntree() {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT nomRecette FROM recette INNER JOIN typePlat ON recette.idTypePlat=typeplat.idTypePlat WHERE nomType LIKE "entree" ORDER BY nomRecette';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}
function getPlat() {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT nomRecette FROM recette INNER JOIN typePlat ON recette.idTypePlat=typeplat.idTypePlat WHERE nomType LIKE "plat" ORDER BY nomRecette';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}
function getDessert() {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT nomRecette FROM recette INNER JOIN typePlat ON recette.idTypePlat=typeplat.idTypePlat WHERE nomType LIKE "dessert" ORDER BY nomRecette';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}
function getNomRecette($nomRecette) {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT nomRecette FROM recette WHERE nomRecette LIKE "%'.$nomRecette.'%" ORDER BY nomRecette';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}
function getIngredient($nomRecette) {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT nomIngredient FROM ingredient INNER JOIN contenir ON ingredient.idIngredient=contenir.idIngredient INNER JOIN recette ON recette.idRecette=contenir.idRecette WHERE nomRecette = "'.$nomRecette.'"';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}
function getPreparation($nomRecette) {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT preparation FROM recette WHERE nomRecette = "'.$nomRecette.'"';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}
function getRecherche() {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT nomRecette FROM recette WHERE nomRecette ='.$blablabla.'';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}
function getTop10DuMoment() {
	$bdd = connexion::getInstance() -> connect();
	$requete = 'SELECT nomRecette FROM recette ORDER BY RAND() LIMIT 10';
	$req = $bdd -> prepare($requete);
	$req -> execute();
	$result = $req -> fetchAll();
	return ($result);
}

?>
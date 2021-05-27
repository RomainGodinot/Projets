<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8" />
	<title>Cu'Easyne</title>
	<link rel="stylesheet" type="text/css" href="theStyles.css">
	<script type="text/javascript">
		function randomImg(){
			document.getElementById('image').src = "pictures/photoplat/photo" + Math.round(Math.random()*6) + ".png";
		}
	</script>
</head>

<body style="background-color:#DEF7C8;" onload="randomImg()">
	<div id = "nav">
		<ul>
			<li><a id="Logo" href="page accueil.php"><div id="navtextLogo"><img src="Logo_Walibi.png" alt="logo" style="width:40px;height:90"></div></a></li>
			<li><a href="Entrees.php"><div id="navtext">Entrées</div></a></li>
			<li><a href="Plats.php"><div id="navtext">Plats</div></a></li>
			<li><a href="Desserts.php"><div id="navtext">Desserts</div></a></li>
			<li><a href="Recherche.php"><div id="navtextRech"><img src="recherche.png" alt="logo" style="width:20px;height:30"> </div></a></li>
		</ul>
	</div>
	<br>
	<br>
	<br>
	<br>
	<center>
		<table>
			<tr>
				<td>
					<picture>
						<img src="" id="image" border="3" height=50% width=auto/>
					</picture>
				</td>
			</tr>
		</table>
	</center>
	<?php
	require_once("requetes.php"); ?>
	<center>			
		<table>
			<tr>
				<th> <font size="5"><u> Plats :</u></font></th>
			</tr>
			<tr>
				<td id="nomAliments"><?php
				echo "<br>";
				$tab = getPlat(); 
				for ($i=0;$i<count($tab);$i++) {
					$nomDeLaRecette = $tab[$i]['nomRecette'];
					echo "- ".$tab[$i]['nomRecette'] ."<form method=\"post\" action=\"page pour une recette.php\"> <input type=\"hidden\" name=\"truc\" value = \"".$nomDeLaRecette."\" />  <input type=\"submit\" name=\"".$tab[$i]['nomRecette']."\" value=\"Go !\"/></form> ";
					echo "<br>";
				}
				?></td>
			</tr>
		</table>

	</table>
</center>	
<div id="barreenbas">
	<nav>
		<li> @Copyright ; Creators : Boucheret, Gendre, Godinot, Chaar, Deville </div></a></li>
	</nav>
</body>
</html>
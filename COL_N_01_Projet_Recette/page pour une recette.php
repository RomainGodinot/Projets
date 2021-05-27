<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Cu'Easyne</title>
  <link rel="stylesheet" type="text/css" href="theStyles.css">
</head>

<body style="background-color:#DEF7C8;">
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
    <li id="noValues"><a href="null"> </a></li>
  </center>

  <?php
  require_once("requetes.php"); ?>
  <center>
    <table>
      <tr>
        <td>
          <?php
          $tab1 = getIngredient($_POST['truc']); 
          echo "<p style=\"text-align: center ; font-size: 20px\"><u> Voici la liste des ingédients nécessaires : </u></p>";
          for ($i=0;$i<count($tab1);$i++) {
            echo "- ".$tab1[$i]['nomIngredient'];
            echo "<br>";
            echo "<br>";
          }?>
        </td>
      </tr>
    </table>
  </center>

  <center>
    <table>
      <tr>
        <td>
          <?php
          $tab2 = getPreparation($_POST['truc']);
          echo "<p style=\"text-align: center ; font-size: 20px \"><u> Voici la recette à suivre : </u></p>";
          for ($i=0;$i<count($tab2);$i++) {
            echo "<p style=\"text-align: center\"> ".$tab2[$i]['preparation']." </p>";
            echo "<br>";
            echo "<br>";
          }
          ?>
        </td>
      </tr>
    </table>
  </center>

  <div id="barreenbas">
    <nav>
      <li> @Copyright ; Creators : Boucheret, Gendre, Godinot, Chaar, Deville </div></a></li>
    </nav>
  </body>
  </html>
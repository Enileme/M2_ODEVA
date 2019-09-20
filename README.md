<h1> Emeline DIEU, Thomas MOREAU et Guillaume Lepretre le BG , Projet DONJON COO </h1>

<h3> Introduction au projet </h3>
<p> Le projet à réaliser était un projet donjon. Le principe était qu'un personnage évolue dans un donjon ( ensemble de pièces ) en affrontant des monstres et en utilisant des objets ( Items ) afin de survivre jusqu'à la fin du donjon.</p>

<p> Le sujet nous demandait des connaissances techniques sur la conception orientée objet, nous avons utilisé le principe d'héritage, ainsi que l'implementation d'interfaces ou encore les tests.</p>

<h3> How to </h3>
<p><em>Récuperation du projet : </em> git clone git@gitlab-etu.fil.univ-lille1.fr:moreaut/ProjetDonjon_Dieu_Moreau.git</p>

<p><em>Commande génération de la documentation : </em> <strong> cd ProjetDonjon_Dieu_Moreau </strong> puis <strong> mvn javadoc:javadoc </strong> , la javadoc se trouve dans le dossier target/docs/fil/coo </p>

<p><em>Commande de génération du projet : </em>  mvn package </p>

<p> <em>Commande de l'execution de l'archive générée : </em> java -jar target/ProjetDonjon-1.0-SNAPSHOT.jar

<p> Pour ce projet,  l'UML a été réalisé, les consignes ont été respectées, toutes les fonctionnalités demandées dans le cahier des charges sont présentes dans le jeu. </p>

<p> Nous avons utilisé pour les classes de tests des méthodes de création d'objets abstraits comme vu en TD, ainsi qu'un Mock pour tester certains aspects de l'implémentation.</p>
<p>Toutes les fonctionnalités tesstables du projet ont été testées, les seules parties non tesstées sont les fonctions utilisants des valeurs aléatoires ou encore des entrées claviers. </p>

<p> Cependant, nous n'avons pas réussi à intégrer l'UML dans le fichier README, nous l'avons livré sur le git </p>

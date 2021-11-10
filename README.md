# TP_JEE

## Etudiants du binôme
* VITRY Benjamin
* BELLON Thomas

## Guide d'utilisation
*Note: Le serveur utilisé par le binôme est Payara 5*
Pour utiliser le programme, il faut démarrer le serveur puis lancer les fichiers suivants en fonction de votre but :
* **Enregistrement.jsp**
    * Pour créer des colis et les enregistrer en mémoire
* **Progression.jsp**
    * Pour modifier les informations de localisation d'un colis
* **Suivi.jsp**
    * Pour trouver et consulter les informations d'un colis

## Choix d'implantation
Notre structure se définit comme il suit :
* 3 Servlets
    * Ces 3 servlets ont pour objectif de réaliser les 3 fonctionnalités demandées
* Un objet Colis
    * Reprenant toutes les données nécessaires
    * Serializable pour être stocké en DB
* Un EJB et son interface
    * Contient les méthodes nécessaires pour communiquer avec la DB et gérer la persistence
* 4 JSP
    * Les 3 décrits plus haut
    * **showColis.jsp**
        * Page de visualisation d'un colis donné
        * Permet de visualiser le résultat après les appels de servlets

## Fonctionnement global
1. L'utilisateur rentre des informations dans un des **JSP** via un formulaire des plus classique
2. Ce formulaire pointe vers la **servlet** qui lui correspond
3. La **servlet** va récupérer les paramètres envoyés par l'utilisateur
4. La **servlet** va envoyer ces informations à l'**EJB**
5. L'**EJB** va réaliser l'opération (ex: Créer un colis) en gérant la persistance avec la DB
6. L'**EJB** va renvoyer le colis fraichement traité à la servlet
7. La servlet va afficher la page **showColis.jsp** avec le colis courant
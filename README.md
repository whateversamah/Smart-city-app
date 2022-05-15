# Smart-city-app
Smart City App est une application Java utilisés pour stocker des détails sur une ville particulière. L ‘application fournit également tous les services tels que les réservations d'hôtels touristiques, les informations commerciales, les monuments historiques de la ville, un système d’emailing interne de la ville et plus encore. Cette application contient des informations complètes sur la ville, y compris les attractions, les cartes de localisation, les environnements commerciaux et des informations sur les organisations et les citoyens de celle-ci.

Objectifs de l'application

L'objectif de l’application est de faire évoluer les
technologies de l'information urbaine vers le concept de
villes intelligentes. En utilisant les technologies de
l'information et de la communication pour améliorer la
qualité des services urbains.

Cahier de charge

Un profile personnel pour chaque citoyen, touriste et
établissement.
Un système de login pour les utilisateurs.
Service d’emailing interne de la ville.
Fonctionnalité de payement des différentes factures.
Informations complètes sur la ville.

Système de login
La connexion

L’écran d’accueil demande à l’utilisateur de spécifier quel genre de
profile il a.
L'utilisateur ensuite s'identifie en saisissant son id et mot de passe .
En cliquant sur le bouton login, la classe réalise une connexion a la base
de donnes pour vérifier son identité pour le rediriger enfin vers Home
Page
![image](https://user-images.githubusercontent.com/73135192/168494271-3887b8c4-fd28-4819-a964-b1b410ba0225.png)

Quand un genre de profile est sélectionné, la fenêtre de l’application ouvre la page d’authentification. Ici l’utilisateur fait entrer son mot de passe et son identifiant notamment le « Social number » pour les citoyens :
![image](https://user-images.githubusercontent.com/73135192/168494278-5f118d74-cedc-4246-af68-d8a33754fdfa.png)

 Les profils
Après l’authentification en comparant les données entrées avec celle enregistrées dans la base de données de la ville, l’utilisateur a accès à son profile personnel. 
      Pour les citoyens : 
![image](https://user-images.githubusercontent.com/73135192/168494290-5e41945f-4235-4e6d-a57d-14628216550d.png)
2.4.	Menu
Ce menu regroupe l’ensemble des fonctionnalités de l’application :
•	Système d’email interne.
•	Page de donnes bancaire.
•	Monuments historiques de la ville.
•	Hotels, restaurants, mall, parcs et musées.
•	Service de localisation géographique
•	Profile d’utilisateurs.
![image](https://user-images.githubusercontent.com/73135192/168494310-f7a6f879-e177-4ef0-877b-853ce2a008d6.png)
Service d’emailing 
Chaque utilisateur de l’application a accès à une adresse mail faisant partie d’un service d’emailing interne de la Ville. L’envoie et la réception des emails se fait à travers l’interface suivante.  
![image](https://user-images.githubusercontent.com/73135192/168494328-2958d00d-2255-437b-a577-0a3e5487e727.png)
	Service de payement
Ce service requière une deuxième authentification en utilisant les données du compte bancaire à utiliser.
![image](https://user-images.githubusercontent.com/73135192/168494341-6ce6d2b9-1293-462b-9ff3-a8aad99e1f5e.png)
Informations bancaires
     Ce service sert à afficher les donnes bancaires d’utilisateur : Nom, Numéro Social, RIB, Adresse et Identifiant du compte
![image](https://user-images.githubusercontent.com/73135192/168494354-39497f1b-918e-4238-b4cb-fb3eb047f50f.png)
Avec une fonctionnalité de payement des différentes factures dues.  
![image](https://user-images.githubusercontent.com/73135192/168494362-af67cdd7-75b5-4155-8a6a-213bd1690888.png)


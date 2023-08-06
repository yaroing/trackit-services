# TrackIt Services

## Description
`TrackIt Services` est un dépôt qui contient le code source des microservices de l'application TrackIt. Ces microservices ont été conçus pour offrir une architecture modulaire et scalable, transformant une application monolithique en une architecture orientée microservices.

## Microservices

1. **Core Service** (`yaroing/core-service`): Gestion des fonctionnalités principales.
2. **Catalogue Service** (`yaroing/catalogue-service`): Gestion du catalogue des produits/services.
3. **Partenaire Service** (`yaroing/partenaire-service`): Gestion des partenaires.
4. **Transfert Service** (`yaroing/transfert-service`): Gestion des transferts.
5. **Point de Service** (`yaroing/point-service`): Gestion des points de services.
6. **Gateway** (`yaroing/gateway`): Service de passerelle pour la gestion des requêtes.
7. **Discovery Service** (`yaroing/discovery-service`): Service de découverte pour l'orchestration des microservices.

## Technologies Utilisées

- **Docker**: Pour la conteneurisation des services.
- **MySQL**: Utilisé comme base de données pour la plupart des services.
- **Keycloak**: Pour la gestion de l'authentification.
- **Spring Boot**: Framework principal pour le développement des services.

## Comment démarrer

1. Clonez le dépôt:

git clone https://github.com/yaroing/trackit-services.git

3. Naviguez vers le dossier:

cd trackit-services

3. Utilisez Docker Compose pour démarrer tous les services:
   
docker-compose up -d


## Contribution

Les contributions sont toujours les bienvenues! Veuillez créer une issue pour toute suggestion ou bug, ou soumettez une pull request.



 

# Examen Jee

Ce Projet est un squelette pour votre Examen JEE

C’est un projet Spring Boot préconfigure

1. Créer un **Dossier** dans votre **bureau** avec votre **nom** et **prénom**
  
2. **clonez** le projet dans **le dossier créé** et importez le dans votre IDE.
  
3. Vous devrez créer une **base de données MYSQL** nommée **ExamenJee**
  
4. Pensez à changer le mot de passe de data source pour qu'il correspond à votre configuration
  

# Information sur le projet :

- La vue du projet est base sur le moteur de vue **thymeleaf** avec une *Template*. Utilisez la vue **login** pour créer vos vues personnalisées utilisant la *Template*. La *Template* contient un menu **à personnaliser** pour votre application
   
- La **classe principale** définie le Bean `CommandLineRunner `qui vous aidera dans le test de vos entités. Un compte super admin est créé à l'aide de ce Bean.
   
- Le projet contient déjà un ensemble de classe spécialement pour supporter *Spring Security*. Vous devrez les **utiliser** et les **coupler** avec vos *classes métiers* s'il le faut.
   
- Un contrôleur `HomeControlleur `est fournie. Il servira pour la redirection vers les url de sécurité. Vous devrez le **personnaliser** pour le redirection vers vos URLs.

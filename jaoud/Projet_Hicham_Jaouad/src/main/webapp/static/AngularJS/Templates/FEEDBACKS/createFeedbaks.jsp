matricule Collaborateur : <select ng-model="collaborateur.matricule"  ng-options="collaborateur.matricule as (collaborateur.matricule) for collaborateur in collaborateurs" 
ng-change="affecterCollaborateur(collaborateur);getProjetsByObjectifs(collaborateur.matricule)">
 </select><br/>
 poste actuel : <input type="text" ng-model="collaborateur.poste.intitule" disabled/><br/>
 nom et prenom :<input type="text" ng-model="collaborateur.nom" disabled/><br/>
 code projet : <select ng-model="feedback.projet"  ng-options="projet as (projet.codeprojet) for projet in projets" ng-change="affecterCollaborateur(collaborateur)"> 
</select><br/><br/>
Date et debut de l'intervention : <input type="date" ng-model="feedback.datedebut"/>
<br/><br/>
Date et fin de l'intervention : <input type="date" ng-model="feedback.datefin"/>
 <br/> 
Role jouer au sein de l'equipe :<input type="text" ng-model="feedback.rolejouer"/>
<br/>
Nombre des jours valorisés sur le projet : <input type="text" ng-model="feedback.nbrJourValorise"/>

<br/>
<input type="submit"  ng-click="savefeedback()"/>
 
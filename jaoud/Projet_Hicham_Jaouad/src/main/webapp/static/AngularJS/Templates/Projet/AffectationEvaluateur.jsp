<div>

Matricule collaborateur : <input type="text" ng-model="collaborateur1.matricule" disabled/>
<div ng-repeat="objectif in collaborateur1.objectifsCollabs" >
<fieldset>
<legend>Projet {{objectif.projet.codeprojet}}</legend>
   <input type="text" ng-model="objectif.projet.codeprojet" disabled/>
   <div ng-repeat="evaluateur in objectif.projet.evaluateurs" ng-init="affecter(objectif.projet.evaluateurs[$index])">
   <input type="text" ng-model="evaluateur.matricule" ><button ng-click="deleteRows(objectif.projet,$index)" ng-show="objectif.projet.evaluateurs.length>1">delete</button></a>
   
   </div>
</fieldset>
</div>

</div>
<button  ng-click="addCollabevaluateur()">Valider</button>
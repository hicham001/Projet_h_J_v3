<button ng-click="affecter()">Voir les derniers modification</button>
<table  border="2">
<thead>
<th>Projet</th>
<th>Objectifs</th>
<th>Descriptions</th>
<th>Mesure</th>
<th>Valider/Rejeter</th>
</thead>
<tbody ng-repeat="(inice2,objectif) in objectifs track by inice2" ng-init="initReponse(collaborateur,objectif)">
<tr ng-repeat="(inice1,desc) in objectif.descriptions track by inice1">
<td rowspan="{{objectif.descriptions.length}}" ng-show="inice1==0">{{objectif.projet.codeprojet}}</td>
<td rowspan="{{objectif.descriptions.length}}" ng-show="inice1==0">{{objectif.intitule}}</td>
<td>{{desc.description}}</td>
<td>{{desc.mesure}}</td>
<td rowspan="{{objectif.descriptions.length}}" ng-show="inice1==0" > <input type="radio" ng-model="reponses[inice2].valeur" value="Valider">Valider <input type="radio" ng-model="reponses[inice2].valeur" value="Rejeter">Rejeter </td>
<tr>


</tbody>

</table>
<button ng-click="addReponses()" ng-show="loading">Valider </button>
<button ng-click="editReponseCollab(reponses)" ng-show="!loading">Modifier </button>
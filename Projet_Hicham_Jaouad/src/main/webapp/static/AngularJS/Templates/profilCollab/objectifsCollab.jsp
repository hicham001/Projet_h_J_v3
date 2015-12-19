<table  border="2">
<thead>
<th>Projet</th>
<th>Objectifs</th>
<th>Descriptions</th>
<th>Mesure</th>
<th>Valider/Rejeter</th>
</thead>
<tbody ng-repeat="(inice2,objectif) in objectifs track by inice2" >
<tr ng-repeat="(inice1,desc) in objectif.descriptions track by inice1" >
<td rowspan="{{objectif.descriptions.length}}" ng-show="inice1==0">{{objectif.projet.codeprojet}}</td>
<td rowspan="{{objectif.descriptions.length}}" ng-show="inice1==0">{{objectif.intitule}}</td>
<td>{{desc.description}}</td>
<td>{{desc.mesure}}</td>
<td rowspan="{{objectif.descriptions.length}}" ng-show="inice1==0"> <input type="radio" ng-model="objectif.reponse.valeur" value="Valider"> <input type="radio" ng-model="objectif.reponse.valeur" value="Rejeter"> </td>
<tr>


</tbody>

</table>
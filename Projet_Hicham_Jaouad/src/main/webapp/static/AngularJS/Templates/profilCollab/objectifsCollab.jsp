<div class="row">
           <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel"> 
            <div class="x_title">
            <div class="col-md-6"><h2>List des Sujets et leurs status</h2></div>
            <div class="col-md-3"></div>
            <div class="col-md-3">
            
			<a ng-click="affecter()"><span class="glyphicon glyphicon-refresh"></span>Refresh</a>
            
           </div>
            <div class="clearfix"></div>
            </div>
            
            <div class="x_content">
<table class="table table-hover">
               
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
<td rowspan="{{objectif.descriptions.length}}" ng-show="inice1==0" > 
<input type="radio" ng-model="reponses[inice2].valeur" value="Valider">Valider 
<input type="radio" ng-model="reponses[inice2].valeur" value="Rejeter">Rejeter </td>
<tr>

</tbody>
</table>
    <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-9">
                               <button type="submit" ng-click="addReponses()" ng-show="loading" class="btn btn-primary">Valider</button>
                              <button type="submit" class="btn btn-success" ng-click="editReponseCollab(reponses)" ng-show="!loading">Modifier</button>
                                                
                                            </div>
                                        </div>

</div></div></div></div>